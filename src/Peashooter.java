package src;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import java.io.InputStream;

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

//        this.imageView = new ImageView(new Image(getClass().getResourceAsStream("src/Textures/Plants And Zobies/Repeater.gif")));
//        imageView.setFitWidth(50);
//        imageView.setFitHeight(50);
//        // Add the imageView to the correct cell in the gridPane
//        GridPane gridPane = cell.getGrid().getPane();
//        gridPane.add(imageView, cell.getColumn(), cell.getRow());
        // Load animated GIF from resources
        InputStream gifStream = getClass().getResourceAsStream("/Textures/Plants And Zobies/Repeater.gif");

        if (gifStream == null) {
            System.out.println("GIF file not found!");
        } else {
            Image gifImage = new Image(gifStream);
            ImageView imageView = new ImageView(gifImage);

            imageView.setFitWidth(80);
            imageView.setFitHeight(80);

            // Add the imageView to the correct cell in the gridPane
            GridPane gridPane = cell.getGrid().getPane();
            gridPane.add(imageView, cell.getColumn(), cell.getRow());
        }

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
        if (currentCell != null) {
            // TODO: Remove imageView from grid's pane when available
            // currentCell.getGrid().getPane().getChildren().remove(imageView);
            // currentCell.removePlant();
            currentCell = null;
        }
    }
}
