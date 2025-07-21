package src;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Repeater extends Plant {
    private int health;
    private int cost;
    private int shootInterval;
    private long lastShootTime;
    private ImageView imageView;
    private Cell cell;

    public Repeater(Cell cell) {
        this.cell = cell;
        this.health = 300; // example value, change if needed
        this.cost = 200;   // example value, change if needed
        this.shootInterval = 2000; // in milliseconds
        this.lastShootTime = 0;

        Image image = new Image(getClass().getResourceAsStream("/Textures/Plants And Zobies/Repeater.gif"));
        imageView = new ImageView(image);
        imageView.setFitWidth(50);
        imageView.setFitHeight(50);

        cell.getGrid().getPane().add(imageView, cell.getColumn(), cell.getRow());
    }

    public void update(long currentTime) {
        // update logic (e.g., shoot twice)
    }

    public void shoot() {
        // shooting logic (two bullets)
    }

    public boolean canShoot(long currentTime) {
        return false; // check shoot interval
    }

    @Override
    public void plant(Cell cell) {

    }

    @Override
    public void takeDamage(int damage) {

    }

    @Override
    public void update(double currentTime) {

    }

    @Override
    protected void removeFromGrid() {

    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getCost() {
        return cost;
    }

    public int getShootInterval() {
        return shootInterval;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }
}
