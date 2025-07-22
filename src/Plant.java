import javafx.scene.image.ImageView;

public abstract class Plant {
    protected int health;                // Current health points
    protected int damage;
    protected final int maxHealth;       // Maximum health (for healing/reset)
    protected int cost;                  // Sun cost to plant
    protected int cooldown;              // Time (seconds) before reuse
    protected Cell currentCell;          // Grid position
    protected ImageView imageView;       // Visual representation
    protected PlantType type;



    public enum PlantType {
        PEASHOOTER,
        SUNFLOWER,
        WALL_NUT,
        CHERRY_BOMB,
        SNOW_PEA
    }

    public Plant(int health, int cost, int cooldown, PlantType type) {
        this.maxHealth = this.health = health;
        this.cost = cost;
        this.cooldown = cooldown;
        this.type = type;
    }

    protected Plant(int health, int cost, int cooldown, PlantType type, Cell cell) {
        this(health, cost, cooldown, type);
        this.currentCell = cell;
    }


    public abstract void plant(Cell cell);

    public abstract void takeDamage(int damage);

    public abstract void update(double currentTime);

    protected abstract void removeFromGrid();

    public boolean isAlive() { return health > 0; }

    public boolean canAttack() { return false; } // Override in subclasses

    // ===== GETTERS ===== //

    public void setHealth(int health) {this.health = health;}
    public int getHealth() { return health; }
    public int getCost() { return cost; }
    public int getCooldown() { return cooldown; }
    public PlantType getType() { return type; }
    public ImageView getImageView() { return imageView; }
    public Cell getCurrentCell() { return currentCell; }



}
