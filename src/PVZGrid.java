import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.security.cert.PolicyNode;
public class PVZGrid extends Application{

//    private static final int COLS = 9; // 9 columns (vertical)
//    private static final int ROWS = 5; // 5 rows (horizontal)
//    private final int CELL_WIDTH; //92
//    private final int CELL_HEIGHT; //97
//    private StackPane stackPane;

//    private GridPane gridPane = new GridPane(); // GridPane to hold the cells
//    private BorderPane borderPane;
    static AnchorPane anchorPane;
    private HBox hBox;

    public PVZGrid(int cellWidth, int cellHeight) {
//        this.CELL_WIDTH = cellWidth;
//        this.CELL_HEIGHT = cellHeight;
//        stackPane = new StackPane();

    }

    public PVZGrid() {
//        this(92, 97); // Default cell size values
    }

    @Override
    public void start(Stage primaryStage) {
//        gridPane.setGridLinesVisible(false); // We'll draw our own borders

        //create 9x5 grid
//        for (int row = 0; row < ROWS; row++) {
//            for (int col = 0; col < COLS; col++) {
////                Rectangle cell = new Rectangle(CELL_WIDTH, CELL_HEIGHT);
////                cell.setFill(Color.LIGHTGREEN); // Grass color
////                cell.setStroke(Color.GRAY); // Border color
////                cell.setStrokeWidth(1);
//
//                // Add click handler
//                final int currentRow = row;
//                final int currentCol = col;
//                cell.setOnMouseClicked(event -> {
//                    System.out.printf("Clicked: [Row %d, Col %d]%n", currentRow, currentCol);
//                    // plant a peashooter on the clicked cell
//                    Peashooter newPeashooter = new Peashooter(100, 50, 5, Plant.PlantType.PEASHOOTER, 10);
//                    Cell clickedCell = new Cell(currentCol, currentRow, this);
//                    newPeashooter.plant(clickedCell);
//                });
//
//                //GridPane uses (col, row)
//                gridPane.add(cell, col, row);
//            }
//        }

//        Scene scene = new Scene(gridPane, COLS * CELL_WIDTH, ROWS * CELL_HEIGHT);
//        Scene scene2 = new Scene(anchorPane, 900, 600);
//        stackPane.getChildren().addAll(gridPane,anchorPane);
//        anchorPane.toFront();
//        Scene scene = new Scene(stackPane, 900, 500);
//        borderPane = new BorderPane();
        anchorPane = new AnchorPane();
        hBox = new HBox();
        hBox.setPrefHeight(200);
        hBox.setPrefWidth(600);


        Image bgImage = new Image(getClass().getResourceAsStream("/resources/background4.jpg"));
        BackgroundImage backgroundImage = new BackgroundImage(
                bgImage,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                new BackgroundSize(1100, 740, false, false, false, false)
        );
        anchorPane.setBackground(new Background(backgroundImage));
        Scene scene = new Scene(anchorPane, 1113, 770);

        primaryStage.setTitle("Plants vs Zombies Grid");
        primaryStage.setScene(scene);
        primaryStage.setMaximized(true);
        primaryStage.setWidth(1113);
        primaryStage.setHeight(770);
//        primaryStage.setResizable(false);
        primaryStage.show();


        ZombieWave1 zombieWave1 = new ZombieWave1();
        ZombieWave2 zombieWave2 = new ZombieWave2();
        ZombieWave3 zombieWave3 = new ZombieWave3();
        ZombieWave4 zombieWave4 = new ZombieWave4();
        ZombieMiddleWave zombieMiddleWave = new ZombieMiddleWave();
        ZombieFinalWave zombieFinalWave = new ZombieFinalWave();
        Thread thread = new Thread(() -> {
         try{
             zombieWave1.createWave();
             Thread.sleep((zombieWave1.getWaveTime())*1000);
             zombieWave2.createWave();
             Thread.sleep(10000);
             zombieMiddleWave.createWave();
             System.out.println("ZombieMiddleWave");
             Thread.sleep((zombieWave1.getWaveTime())*1000+(zombieWave2.getWaveTime())*1000-10000);
             zombieWave3.createWave();
             Thread.sleep((zombieWave1.getWaveTime())*1000+(zombieWave2.getWaveTime())*1000+(zombieWave3.getWaveTime())*1000);
             zombieWave4.createWave();
             Thread.sleep(5000);
             zombieFinalWave.createWave();
             System.out.println("ZombieFinalWave");

         } catch (InterruptedException e) {
             throw new RuntimeException(e);
         }
        });
        thread.start();



    }

//    public int getCellWidth() {
//        return this.CELL_WIDTH;
//    }
//
//    public int getCellHeight() {
//        return this.CELL_HEIGHT;
//    }
//    public Pane getPane() { return this.gridPane; }


    // later make this a separate class
    public static void main(String[] args) {
        launch(args);

    }

//    public GridPane getPane() {
//        return gridPane;
//    }



}
