/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package robot;

/**
 *
 * @author CSU23
 */
public class Robot {
    
    public String nombre;
    public String color;
    public int modelo;
    public int partes;
    
    
   
    public Robot(String nombre,String color,int modelo, int partes){
        this.color = color;
        this.nombre = nombre;
        this.modelo = modelo;
        this.partes = partes;
        
    } 
    
    public String getnombre(){
    return nombre;
    }
    public void setnombre(String nombre){
    this.nombre = "Santoyo";
    }
    
    public String getcolor(){
    return color;
    }
    public void setcolor(String color){
    this.nombre = "azul";
    }
    
    public int getmodelo(){
    return modelo;
    }
    public void setmodelo(int modelo){
    this.modelo = 2015;
    }
    
    public int getpartes(){
    return partes;
    }
    public void setpartes(int partes){
    this.partes = 5;
    }
    
   public void Programar(){
       System.out.println("El robot programa");
        
    }
    public void Asesinar(){
        System.out.println("El robot asesina personas");
        
    }
    public void Limpiar(){
        System.out.println("El robot limpia la casa, despues te asesina");
        
    }
    
}
    
    
    
    




  

    

