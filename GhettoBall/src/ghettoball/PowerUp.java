package ghettoball;

public class PowerUp {
    public float x, y; // Position of the PowerUp
    public String newColor; // Color it will assign

    public PowerUp(float x, float y, String newColor) {
        this.x = x;
        this.y = y;
        this.newColor = newColor;
    }

    public void apply(Player player) {
        player.color = newColor;
    }

    @Override
    public String toString() {
        return "PowerUp{x=" + x + ", y=" + y + ", newColor='" + newColor + "'}";
    }
}
