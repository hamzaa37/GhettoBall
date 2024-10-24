/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ghettoball;

/**
 *
 * @author hamza
 */
public class GhettoBall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ball b1 = new Ball();
        Ball b2 = new Ball(2, 4, 10, 5);      
        Ball b3 = new Ball(b1);
        
        System.out.println("test1:" +b1);
        System.out.println("test2:" +b2);
        System.out.println("test3:" +b3);
        
        //Test getters & setters
        b1.setX(20);
        b1.setY(37);
        b1.setVelocityX(1.5f);
        b1.setVelocityY(2.0f);
        b1.setRadius(15);
        b1.setSpeed(10); 
        
        System.out.println("X:" +b1.getX());
        System.out.println("Y:" +b1.getY());
        System.out.println("VelocityX:" +b1.getVelocityX());
        System.out.println("VelocityY:" +b1.getVelocityY());
        System.out.println("Radius:" +b1.getRadius());
        System.out.println("Speed:" +b1.getSpeed());
            
            
    }
    
}
