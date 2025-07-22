import javafx.application.Platform;

import java.util.Random;

public class ZombieWave1 extends ZombieWave{
    ZombieWave1(){
        super(3,1,15);
    }
    Random random = new Random();
    public void createWave(){
        Thread thread = new Thread(()->{
            try{
                for(int x = 0; x < this.getWaveTime()/this.getRespawnSpeed(); x++){
                    NormalZombie normalZombie = new NormalZombie(1200,(random.nextInt(5)*125)+10);

                    this.zombies.add(normalZombie);

                    Platform.runLater(()->{
                        PVZGrid.anchorPane.getChildren().add(normalZombie);
                        normalZombie.moving();
                    });

                    Thread.sleep(this.getRespawnSpeed()*1000);
                }}
            catch(Exception e){
                e.printStackTrace();

            }
        });
        thread.start();
    }

}
