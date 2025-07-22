public abstract class OffensivePlant extends Plant {

    public OffensivePlant(int health, int cost, int cooldown, PlantType type, int damage) {
        super(health, cost, cooldown, type);
    }

    void shoot () {}

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
}
