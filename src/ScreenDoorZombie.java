import javafx.scene.image.Image;

public class ScreenDoorZombie extends Zombie{
    public ScreenDoorZombie(double x,double y){
        super(10,4,x,y);
        super.setType(ZombieType.SCREENDOOR);
        super.setActionState(ZombieActionState.MOVING);
        super.setHealthState(ZombieHealthState.HEALTHY);
        this.zombieImage = new Image(getClass().getResourceAsStream("/resources/PeaShooter2.gif"));
        this.setImage(this.zombieImage);
    }
}
