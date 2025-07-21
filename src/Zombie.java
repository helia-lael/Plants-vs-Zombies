import javafx.scene.control.Cell;
import javafx.scene.image.ImageView;

public class Zombie {
    Cell currentCell;
    private int health;
    private int damage;
    ImageView currentFrame;
    void TakeDamage (int damage) {};
    public enum zombieState {
        HEALTHY,
        ULMOSTHEALTHY,
        UNHEALTHY,
        DEAD
    }

}
