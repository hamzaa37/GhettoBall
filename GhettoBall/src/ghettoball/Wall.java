package ghettoball;

public class Wall {
    public float x, y, width, height; // Position and size

    public Wall(float x, float y, float width, float height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Wall{x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + "}";
    }
}

