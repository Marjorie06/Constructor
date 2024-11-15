/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.sistemassolar.clase;

import ec.edu.espoch.sistemassolar.clase.enumeraciones.TipoPlaneta;

/**
 *
 * @author SO-LAB1-PC13
 */
public class Planeta {
    
    //Atributos
    public String nombre;
    public int  cantidadSatelite;
    public double masaKilometro;
    public double volKm3;
    public double kilometro;
    public int distanciaMedidaSol;
    public TipoPlaneta tipoPlaneta;
    public  boolean exterior=false;
    
    //Constructor
    public Planeta(){
    }
    
   
    /* public Planeta(){
        
    }*/
    
    public Planeta(String nombre){
        this.nombre=nombre;
        
    }

    //constructor no vacio
    
    
 public void imprimir(){
     System.out.println("Nombre:"+ nombre);
     System.out.println("Cantidad de satelites:"+ cantidadSatelite);
     System.out.println("Masa en kilometros:"+ masaKilometro);
     System.out.println("Volumen en kilogramos:"+ volKm3);
     System.out.println("Diametros en kiulometros:"+ kilometro);
     System.out.println("Distancia en mediad al sol:"+ distanciaMedidaSol);
     System.out.println("Tipo de Planeta:"+ tipoPlaneta);
 }           
            
    
    public double calcularDensidadPlaneta(){
       return masaKilometro/volKm3;
    }
    
    public boolean exterior(){
        
        double maximo=3.4;
        double distancia=149597870;
        double limite=maximo*distancia;

        
           if (distanciaMedidaSol >limite){
               exterior();
                            
                        }
        
       return false;
        
    }
}