/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ghettoball;

/**
 *
 * @author hamza
 */
public class Ball {
    // Attributes
    private float x, y;         // Position of the ball (coordinates)
    private float velocityX, velocityY; // Velocity of the ball (movement in x and y direction)
    private float radius;       // Radius of the ball
    private float speed;        // Speed of the ball

    // Constructor
    public Ball(float x, float y, float radius, float speed) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.speed = speed;
        this.velocityX = 0;
        this.velocityY = 0;
    }

    // Getters and Setters
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getVelocityX() {
        return velocityX;
    }

    public void setVelocityX(float velocityX) {
        this.velocityX = velocityX;
    }

    public float getVelocityY() {
        return velocityY;
    }

    public void setVelocityY(float velocityY) {
        this.velocityY = velocityY;
    }

    // Method to update the ball's position based on its velocity
    public void updatePosition(float deltaTime) {
        this.x += velocityX * speed * deltaTime;
        this.y += velocityY * speed * deltaTime;
    }

    // Method to set the ball's velocity
    public void setVelocity(float velocityX, float velocityY) {
        this.velocityX = velocityX;
        this.velocityY = velocityY;
    }

    // Method to check for collision with boundaries (e.g., screen edges)
    public void checkBoundaryCollision(float screenWidth, float screenHeight) {
        if (x - radius < 0 || x + radius > screenWidth) {
            velocityX = -velocityX; // Reverse direction on x-axis
        }
        if (y - radius < 0 || y + radius > screenHeight) {
            velocityY = -velocityY; // Reverse direction on y-axis
        }
    }

    // Method to handle ball movement and collisions in one step
    public void move(float deltaTime, float screenWidth, float screenHeight) {
        updatePosition(deltaTime);
        checkBoundaryCollision(screenWidth, screenHeight);
    }
}
// unfinished_

