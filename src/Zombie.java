import javafx.animation.TranslateTransition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class Zombie extends ImageView{
//    Cell currentCell;
    protected TranslateTransition transition;
    private int health;
    private double speed;
    protected Image zombieImage;
    private ZombieType type;
    private ZombieHealthState healthState;
    private ZombieActionState actionState;
    public Zombie(int health, double speed, double x, double y) {
        this.health = health;
        this.speed = speed;
        this.setLayoutX(x);
        this.setLayoutY(y);
        transition = new TranslateTransition();
        this.setFitHeight(200);
        this.setFitWidth(140);
    }

//    ImageView currentFrame;
//    void TakeDamage (int damage) {};
    public void eat(Plant plant) {
        plant.setHealth(plant.getHealth()-1);
    }
    public void moving(){
        transition.setNode(this);
        transition.setFromX(0);
        transition.setToX(-1400);
        transition.setDuration(Duration.seconds(22*speed));
        transition.setCycleCount(1);
        transition.play();

    }
    public void stopMoving(){
        transition.stop();
    }



    public int getHealth() {
        return health;
    }

    public double getSpeed() {
        return speed;
    }

//    public double getX() {
//        return x;
//    }
//
//    public double getY() {
//        return y;
//    }
//
//    public ImageView getImage() {
//        return image;
//    }

    public ZombieType getType() {
        return type;
    }

    public ZombieHealthState getHealthState() {
        return healthState;
    }

    public ZombieActionState getActionState() {
        return actionState;
    }

    public Image getZombieImage() {
        return zombieImage;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }


    public void setZombieImage(Image image) {
        this.zombieImage = image;
    }

    //    public void setX(double x) {
//        this.x = x;
//    }
//
//    public void setY(double y) {
//        this.y = y;
//    }

//    public void setImage(ImageView image) {
//        this.image = image;
//    }

    public void setType(ZombieType type) {
        this.type = type;
    }

    public void setHealthState(ZombieHealthState healthState) {
        this.healthState = healthState;
    }

    public void setActionState(ZombieActionState actionState) {
        this.actionState = actionState;
    }
}
