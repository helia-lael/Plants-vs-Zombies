import javafx.application.Platform;

import java.util.Random;

public class ZombieWave3 extends ZombieWave{
    ZombieWave3(){
        super(2,1,15);
    }
    Random random = new Random();
    public void createWave(){
        Thread thread = new Thread(()->{
            try{
                for(int x = 0; x < this.getWaveTime()/this.getRespawnSpeed(); x++){
                    int z = random.nextInt(3);
                    if(z == 0){
                        NormalZombie normalZombie = new NormalZombie(1200,(random.nextInt(5)*125)+10);

                        this.zombies.add(normalZombie);
                        Platform.runLater(()->{
                            PVZGrid.anchorPane.getChildren().add(normalZombie);
                            normalZombie.moving();
                        });
                        Thread.sleep(this.getRespawnSpeed()*1000);
                    }
                    else if(z == 1){
                        ConeheadZombie coneheadZombie = new ConeheadZombie(1200,(random.nextInt(5)*125)+10);

                        this.zombies.add(coneheadZombie);
                        Platform.runLater(()->{
                            PVZGrid.anchorPane.getChildren().add(coneheadZombie);
                            coneheadZombie.moving();
                        });
                        Thread.sleep(this.getRespawnSpeed()*1000);
                    }
                    else if(z == 2){
                        ScreenDoorZombie screenDoorZombie = new ScreenDoorZombie(1200,(random.nextInt(5)*125)+10);

                        this.zombies.add(screenDoorZombie);
                        Platform.runLater(()->{
                            PVZGrid.anchorPane.getChildren().add(screenDoorZombie);
                            screenDoorZombie.moving();
                        });
                        Thread.sleep(this.getRespawnSpeed()*1000);
                    }

                }}
            catch(Exception e){
                e.printStackTrace();

            }
        });
        thread.start();
    }
}
