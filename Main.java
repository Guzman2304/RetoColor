/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package robot;

/**
 *
 * @author CSU23
 */
public class Main {
    
    public static void main (String []args){
        Robot r1 = new Robot("Santoy","Azul", 2024,6);
        Perro p1 = new Perro("Matias","Cafe","Labrador","Grande");
        System.out.println(r1.getnombre());
        System.out.println(p1.getnombre());
    }
    
    
}
