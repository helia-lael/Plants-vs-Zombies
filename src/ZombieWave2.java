import javafx.application.Platform;

import java.util.Random;

public class ZombieWave2 extends ZombieWave{
    ZombieWave2(){
        super(2,1,15);
    }
    Random random = new Random();
    public void createWave(){
        Thread thread = new Thread(()->{
            try{
                for(int x = 0; x < this.getWaveTime()/this.getRespawnSpeed(); x++){
                    int z = random.nextInt(2);
                    if(z == 0){
                        NormalZombie normalZombie = new NormalZombie(1200,(random.nextInt(5)*125)+10);

                        this.zombies.add(normalZombie);
                        Platform.runLater(()->{
                            PVZGrid.anchorPane.getChildren().add(normalZombie);
                            normalZombie.moving();
                        });
                    }
                    else if(z == 1){
                        ConeheadZombie coneheadZombie = new ConeheadZombie(1200,(random.nextInt(5)*125)+10);

                        this.zombies.add(coneheadZombie);
                        Platform.runLater(()->{
                            PVZGrid.anchorPane.getChildren().add(coneheadZombie);
                            coneheadZombie.moving();
                        });
                    }
                    Thread.sleep(this.getRespawnSpeed()*1000);

                }}
            catch(Exception e){
                e.printStackTrace();

            }
        });
        thread.start();
    }
}
