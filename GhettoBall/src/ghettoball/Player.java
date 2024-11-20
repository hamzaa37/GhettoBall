package ghettoball;

public class Player {
    public float x, y; // Position
    public String color; // Player's color

    public Player(float x, float y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void move(float dx, float dy) {
        x += dx;
        y += dy;
    }

    @Override
    public String toString() {
        return "Player{x=" + x + ", y=" + y + ", color='" + color + "'}";
    }
}
