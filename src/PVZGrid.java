import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class PVZGrid extends Application {
    private static final int COLS = 9; // 9 columns (vertical)
    private static final int ROWS = 5; // 5 rows (horizontal)
    private static final int CELL_SIZE = 80; // pixels

    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();
        gridPane.setGridLinesVisible(false); // We'll draw our own borders

        //create 9x5 grid
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                Rectangle cell = new Rectangle(CELL_SIZE, CELL_SIZE);
                cell.setFill(Color.LIGHTGREEN); // Grass color
                cell.setStroke(Color.GRAY); // Border color
                cell.setStrokeWidth(1);

                // Add click handler
                final int currentRow = row;
                final int currentCol = col;
                cell.setOnMouseClicked(event -> {
                    System.out.printf("Clicked: [Row %d, Col %d]%n", currentRow, currentCol);
                });

                //GridPane uses (col, row)
                gridPane.add(cell, col, row);
            }
        }

        Scene scene = new Scene(gridPane, COLS * CELL_SIZE, ROWS * CELL_SIZE);
        primaryStage.setTitle("Plants vs Zombies Grid");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // later make this a separate class
    public static void main(String[] args) {
        launch(args);
    }
}