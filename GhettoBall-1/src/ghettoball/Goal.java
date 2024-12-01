package ghettoball;

public class Goal {
    private int x;
    private int y;
    private int width;
    private int height;

    public Goal(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // Getters and setters
    public int getX() { return x; }
    public void setX(int x) { this.x = x; }
    public int getY() { return y; }
    public void setY(int y) { this.y = y; }
    public int getWidth() { return width; }
    public void setWidth(int width) { this.width = width; }
    public int getHeight() { return height; }
    public void setHeight(int height) { this.height = height; }

    @Override
    public String toString() {
        return "Goal[x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + "]";
    }
}

