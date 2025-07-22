import javafx.application.Platform;

import java.util.Random;

public class ZombieMiddleWave extends ZombieWave{
    ZombieMiddleWave(){
        super(1,2,7);
    }
    Random  random = new Random();
    public void createWave(){
            Thread thread = new Thread(() -> {
                try{
                    for(int x = 0; x < this.getWaveTime()/this.getRespawnSpeed(); x++){
                        for(int i = 0; i<5;i++){

                            for(int j = 0; j<2;j++){
                                int z = random.nextInt(2);

                                if(z==0){
                                    NormalZombie normalZombie = new NormalZombie(1200,(i*125)+10);

                                    this.zombies.add(normalZombie);
                                    Platform.runLater(()->{
                                        PVZGrid.anchorPane.getChildren().add(normalZombie);
                                        normalZombie.moving();
                                    });
                                    Thread.sleep(100);
                                }
                                if(z==1){
                                    ConeheadZombie coneheadZombie = new ConeheadZombie(1200,(i*125)+10);

                                    this.zombies.add(coneheadZombie);
                                    Platform.runLater(()->{
                                        PVZGrid.anchorPane.getChildren().add(coneheadZombie);
                                        coneheadZombie.moving();
                                    });
                                    Thread.sleep(100);
                                }
                            }
                        }
                    }
                }catch(InterruptedException e){
                    e.printStackTrace();
                }

            });
            thread.start();
    }
}
