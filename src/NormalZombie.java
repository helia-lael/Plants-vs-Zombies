import javafx.scene.image.Image;

public class NormalZombie extends Zombie {
    public NormalZombie(double x,double y) {
        super(5,4,x,y);
        super.setType(ZombieType.NORMAL);
        super.setActionState(ZombieActionState.MOVING);
        super.setHealthState(ZombieHealthState.HEALTHY);
        this.zombieImage = new Image(getClass().getResourceAsStream("/resources/ZombieMoving.gif"));
        this.setImage(this.zombieImage);
    }

}
