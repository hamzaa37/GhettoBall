package ghettoball;

public class Goal {
    public float x, y, width, height; // Position and size

    public Goal(float x, float y, float width, float height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Goal{x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + "}";
    }
}

