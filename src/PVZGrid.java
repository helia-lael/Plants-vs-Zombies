import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.security.cert.PolicyNode;

public class PVZGrid extends Application {
    private static final int COLS = 9; // 9 columns (vertical)
    private static final int ROWS = 5; // 5 rows (horizontal)
    private final int CELL_WIDTH; //92
    private final int CELL_HEIGHT; //97

    private GridPane gridPane = new GridPane(); // GridPane to hold the cells

    public PVZGrid(int cellWidth, int cellHeight) {
        this.CELL_WIDTH = cellWidth;
        this.CELL_HEIGHT = cellHeight;
    }

    public PVZGrid() {
        this(92, 97); // Default cell size values
    }

    @Override
    public void start(Stage primaryStage) {
        gridPane.setGridLinesVisible(false); // We'll draw our own borders

        //create 9x5 grid
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                Rectangle cell = new Rectangle(CELL_WIDTH, CELL_HEIGHT);
                cell.setFill(Color.LIGHTGREEN); // Grass color
                cell.setStroke(Color.GRAY); // Border color
                cell.setStrokeWidth(1);

                // Add click handler
                final int currentRow = row;
                final int currentCol = col;
                cell.setOnMouseClicked(event -> {
                    System.out.printf("Clicked: [Row %d, Col %d]%n", currentRow, currentCol);
                    // plant a peashooter on the clicked cell
                    Peashooter newPeashooter = new Peashooter(100, 50, 5, Plant.PlantType.PEASHOOTER, 10);
                    Cell clickedCell = new Cell(currentCol, currentRow, this);
                    newPeashooter.plant(clickedCell);
                });

                //GridPane uses (col, row)
                gridPane.add(cell, col, row);
            }
        }

        Scene scene = new Scene(gridPane, COLS * CELL_WIDTH, ROWS * CELL_HEIGHT);
        primaryStage.setTitle("Plants vs Zombies Grid");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public int getCellWidth() {
        return this.CELL_WIDTH;
    }

    public int getCellHeight() {
        return this.CELL_HEIGHT;
    }
//    public Pane getPane() { return this.gridPane; }


    // later make this a separate class
    public static void main(String[] args) {
        launch(args);

    }

    public GridPane getPane() {
        return gridPane;
    }
}