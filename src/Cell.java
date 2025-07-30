public class Cell {
    private boolean isOccupied;
//    private Plant plant;
    private int col;
    private int row;
    private double x;
    private double y;
//    private PVZGrid grid;  // Reference to parent grid

    public Cell(int row, int col,double x, double y ) {
//        this.grid = pvzGrid;
        this.col = col;
        this.row = row;
        this.isOccupied = false;
        this.x = x;
        this.y = y;
//        this.plant = null;
    }

//    public PVZGrid getGrid() { return grid; }

    public int getColumn() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public boolean isOccupied() { return isOccupied; }
//    public Plant getPlant() { return plant; }

//    public void setPlant(Plant plant) {
//        this.plant = plant;
//        this.isOccupied = true;
//    }

//    public void removePlant() {
//        this.plant = null;
//        this.isOccupied = false;
//    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }
}
