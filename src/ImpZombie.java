import javafx.scene.image.Image;

public class ImpZombie extends Zombie{
    public ImpZombie(double x,double y){
        super(3,8,x,y);
        super.setType(ZombieType.IMP);
        super.setActionState(ZombieActionState.MOVING);
        super.setHealthState(ZombieHealthState.HEALTHY);
        this.zombieImage = new Image(getClass().getResourceAsStream("/resources/impzombie22.gif"));
        this.setImage(this.zombieImage);

    }
}
