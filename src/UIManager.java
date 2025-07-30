import javafx.animation.AnimationTimer;

public class UIManager {
    AnimationTimer animationTimer;
    public UIManager() {
        animationTimer = new AnimationTimer() {
            public void handle(long now) {
                for(Zombie zombie : ZombieWave.zombies){
                    if(zombie.getActionState()==ZombieActionState.MOVING){
                        zombie.setLayoutX(zombie.getLayoutX()-zombie.getSpeed()/12);
                    }
                    if(zombie.getActionState()==ZombieActionState.STOPPED){

                    }
                    if(zombie.getActionState()==ZombieActionState.EATING){
                        zombie.eating();
                    }
                }
            }
        };
        animationTimer.start();
    }

}
