package ghettoball;

public class PowerUp {
    private int x;
    private int y;
    private String type;

    // Parametric constructor
    public PowerUp(int x, int y, String type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    // Getters and setters
    public int getX() { return x; }
    public void setX(int x) { this.x = x; }
    public int getY() { return y; }
    public void setY(int y) { this.y = y; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    // Apply the PowerUp to the Player
    public void apply(Player player) {
        // Add fire surrounding to the player's body
        player.setFireSurrounding(true);
    }

    @Override
    public String toString() {
        return "PowerUp[x=" + x + ", y=" + y + ", type=" + type + "]";
    }
}