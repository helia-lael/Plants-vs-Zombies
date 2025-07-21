package src;

public class Cell {
    private boolean isOccupied;
    private Plant plant;

    private int column;
    private int row;
    private PVZGrid grid;  // Reference to parent grid

    public Cell(int currentCol, int currentRow, PVZGrid pvzGrid) {
        this.grid = pvzGrid;
        this.column = currentCol;
        this.row = currentRow;
        this.isOccupied = false;
        this.plant = null;
    }

    public PVZGrid getGrid() { return grid; }

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    public boolean isOccupied() { return isOccupied; }
    public Plant getPlant() { return plant; }

    public void setPlant(Plant plant) {
        this.plant = plant;
        this.isOccupied = true;
    }

    public void removePlant() {
        this.plant = null;
        this.isOccupied = false;
    }
}
