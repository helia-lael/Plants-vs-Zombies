package src;

import javafx.scene.image.ImageView;
import javafx.scene.image.Image;

public class Bullet {
    private int damage;
    private ImageView imageView;
    private double x, y;

    public Bullet(int damage, double x, double y) {
        this.damage = damage;
        this.x = x;
        this.y = y;
        this.imageView = new ImageView(new Image(getClass().getResourceAsStream("/images/pea.png")));
        imageView.setX(x);
        imageView.setY(y);
        imageView.setFitWidth(30);
        imageView.setFitHeight(30);
    }

    public ImageView getImageView() { return imageView; }
    public int getDamage() { return damage; }
    public void move(double dx) { x += dx; imageView.setX(x); }
}
