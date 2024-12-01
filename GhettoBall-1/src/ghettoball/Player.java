package ghettoball;


public class Player {
    private float x;
    private float y;
    private String color;
    private boolean fireSurrounding;

    public Player(float x, float y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.fireSurrounding = false;
    }

    public void move(float dx, float dy) {
        x += dx;
        y += dy;
    }

    public boolean isFireSurrounding() {
        return fireSurrounding;
    }

    public void setFireSurrounding(boolean fireSurrounding) {
        this.fireSurrounding = fireSurrounding;
    }

    // Method to kick a ball
    public void kickBall(Ball ball, float velocityX, float velocityY) {
        ball.setVelocity(velocityX, velocityY);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Player{x=").append(x).append(", y=").append(y).append(", color='").append(color).append("'");
        if (fireSurrounding) {
            sb.append(", fireSurrounding='orange'");
        }
        sb.append("}");
        return sb.toString();
    }
}
