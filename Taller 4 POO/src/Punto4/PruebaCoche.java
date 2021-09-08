/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto4;

/**
 *
 * @author German
 */
public class PruebaCoche {
    
    public static void main(String[] args) {
        //Coche 1
        Coche a = new Coche();
        imprimircoches(a);
        
        //Coche 2
        Coche b= new Coche("Amarillo","Lamborghini","Aventador","TJI-256",1200);
        imprimircoches(b);
        
        b.setcolor("Rojo carmesí");
        System.out.print("Luego de 5 años\n\n");
        imprimircoches(b);
        
        b.setcolor("Azul");
        System.out.print("Luego de 10 años\n\n");
        imprimircoches(b);
        
        //Coche 3
        Coche c= new Coche("Verde","Ford","Fiesta");
        imprimircoches(c);
        
        
        c.setcolor("Morado");
        System.out.print("Luego de 5 años\n\n");
        imprimircoches(c);
        
        c.setcolor("Rosado");
        System.out.print("Luego de 10 años\n\n");
        imprimircoches(c);
        
        // Coche 4
        Coche d= new Coche(245,2);
        imprimircoches(d);  
        
    }
    
          
        public static void imprimircoches(Coche c){
        System.out.println("Color: " + c.getcolor());
        System.out.println("Marca: " + c.getmarca());
        System.out.println("Modelo: "+ c.getmodelo());
        System.out.println("Número de caballos: " + c.getnumcaballos());
        System.out.println("Número de puertas: "+c.getnumpuertas());
        System.out.println("Matricula: " + c.getmatricula());
        System.out.println("--------------------------------");
    }
    }

