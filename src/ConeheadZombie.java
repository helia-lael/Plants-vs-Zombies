import javafx.scene.image.Image;

public class ConeheadZombie extends Zombie {
    public ConeheadZombie(double x,double y){
        super(7,4,x,y);
        super.setType(ZombieType.CONEHEAD);
        super.setActionState(ZombieActionState.MOVING);
        super.setHealthState(ZombieHealthState.HEALTHY);
        this.zombieImage = new Image(getClass().getResourceAsStream("/resources/ZombieKolahdar.gif"));
        this.setImage(this.zombieImage);
    }
}
