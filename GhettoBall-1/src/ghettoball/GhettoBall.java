package ghettoball;

public class GhettoBall {

    public static void main(String[] args) {
        // Ball Tests
        Ball b1 = new Ball(); // Default Ball
        Ball b2 = new Ball(10, 10, 5, 2); // Ball with smaller, manageable values
        Ball b3 = new Ball(b1); // Copy Ball

        System.out.println("test1:" + b1);
        System.out.println("test2:" + b2);
        System.out.println("test3:" + b3);

        // Test getters & setters for Ball
        b1.setX(50); // Move ball to a practical position
        b1.setY(50);
        b1.setVelocityX(1);
        b1.setVelocityY(1);
        b1.setRadius(5); // Smaller radius for better scaling
        b1.setSpeed(3); // Moderate speed

        System.out.println("Updated Ball 1 X: " + b1.getX());
        System.out.println("Updated Ball 1 Y: " + b1.getY());
        System.out.println("Updated Ball 1 VelocityX: " + b1.getVelocityX());
        System.out.println("Updated Ball 1 VelocityY: " + b1.getVelocityY());
        System.out.println("Updated Ball 1 Radius: " + b1.getRadius());
        System.out.println("Updated Ball 1 Speed: " + b1.getSpeed());

        // Player Tests
        Player player = new Player(20, 30, "Red"); // Start player in a realistic position
        System.out.println("\nInitial Player: " + player);
        player.move(5, -5); // Small move to simulate easy testing
        System.out.println("Player after move: " + player);

        // Wall Tests
        Wall wall = new Wall(10, 40, 20, 5); // Narrow wall for testing collisions
        System.out.println("\nWall: " + wall);

        // Goal Tests
        Goal goal = new Goal(80, 10, 15, 10); // Small goal area
        System.out.println("Goal: " + goal);

        // PowerUp Tests
        PowerUp powerUp = new PowerUp(25, 25, "Blue"); // Easy-to-reach position for PowerUp
        System.out.println("\nPowerUp: " + powerUp);

        // Apply the PowerUp to the Player
        powerUp.apply(player);
        System.out.println("Player after PowerUp: " + player);
    }
}
