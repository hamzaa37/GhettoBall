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
        
    }
    
}
