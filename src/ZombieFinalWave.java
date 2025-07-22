import javafx.application.Platform;

import java.util.Random;

public class ZombieFinalWave extends ZombieWave{
    ZombieFinalWave(){
        super(1,3,13);
    }
    Random random = new Random();
    public void createWave(){
        Thread thread = new Thread(() -> {
            try{
                for(int x = 0; x < this.getWaveTime()/this.getRespawnSpeed(); x++){
                    for(int i = 0; i<5;i++){

                        for(int j = 0; j<this.getRespawnZombieNumbers();j++){
                            int z = random.nextInt(4);

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
                            if(z==2){
                                ScreenDoorZombie screenDoorZombie = new ScreenDoorZombie(1200,(i*125)+10);

                                this.zombies.add(screenDoorZombie);

                                Platform.runLater(()->{
                                    PVZGrid.anchorPane.getChildren().add(screenDoorZombie);
                                    screenDoorZombie.moving();
                                });
                                Thread.sleep(100);

                            }
                            if(z==3){
                                ImpZombie impZombie = new ImpZombie(1200,(i*125)+10);

                                this.zombies.add(impZombie);

                                Platform.runLater(()->{
                                    PVZGrid.anchorPane.getChildren().add(impZombie);
                                    impZombie.moving();
                                });
                                Thread.sleep(100);
                            }
                        }
                    }
                }

            }catch(Exception e){
                e.printStackTrace();
            }

        });
        thread.start();

    }
}
