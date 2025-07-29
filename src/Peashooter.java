package src;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;


public class Peashooter extends Plant {

    public Peashooter (int health, int cost, int cooldown, PlantType type, int damage) {
        super(health, cost, cooldown, type);
        this.damage = damage;
    }

    @Override
    public void plant(Cell cell) {
        if (cell == null) throw new IllegalArgumentException("Cell cannot be null");
        if (cell.isOccupied()) throw new IllegalStateException("Cell already occupied");

        this.currentCell = cell;
        cell.setPlant(this);

        this.imageView = new ImageView(new Image(getClass().getResourceAsStream("ctebentpipe.png")));
        imageView.setFitWidth(50);
        imageView.setFitHeight(50);
        // Add the imageView to the correct cell in the gridPane
        AnchorPane anchorPane = cell.getGrid().getAnchorPane();
        anchorPane.getChildren();
    }

    @Override
    public void takeDamage(int damage) {
        health -= damage;
    }

    @Override
    public void update(double currentTime) {

    }

    @Override
    protected void removeFromGrid() {
        if (currentCell != null && imageView != null) {
            AnchorPane pane = currentCell.getGrid().getAnchorPane();
            pane.getChildren().remove(imageView);
            currentCell.removePlant();
            currentCell = null;
        }
    }
}
