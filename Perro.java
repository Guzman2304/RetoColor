/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package robot;

/**
 *
 * @author CSU23
 */
public class Perro {
    public String nombre;
    public String color;
    public String raza;
    public String tamaño;
    
    
    public Perro(){
    }
    public Perro(String nombre,String color,String raza, String tamaño){
        this.color = color;
        this.nombre = nombre;
        this.raza = raza;
        this.tamaño = tamaño;
        
    }
    
    public String getnombre(){
    return nombre;
    }
    public void setnombre(String nombre){
    this.nombre = "Matias";
    }
    
    public String getcolor(){
    return color;
    }
    public void setcolor(String color){
    this.nombre = "cafe";
    }
    
    public String getraza(){
    return raza;
    }
    public void setraza(String raza){
    this.raza = "Labrador";
    }
    
    public String gettamaño(){
    return tamaño;
    }
    public void settamaño(String tamaño){
    this.tamaño = "Grande";
    }
    
    public void Ladrar(){
        System.out.println("El perro ladra");
    }
    public void Correr(){
        System.out.println("El perro corre");
        
    }
    public void Saltar(){
        System.out.println("El perro salta");
        
    }
    
}
