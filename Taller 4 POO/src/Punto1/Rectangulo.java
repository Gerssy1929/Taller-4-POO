
package Punto1;


public class Rectangulo {
    
    private double base;
    private double altura;
    
    
    public static final String COLOR = "Azul celeste";
    
   //Constructor default
    public Rectangulo(){
        this.base=10;
        this.altura=20;
    }
    
    //Constructor sobrecargado 1
    public Rectangulo(double base, double altura){
        
        this.base = base;
        this.altura = altura;
    }
    
     //Constructor sobrecargado 2
     public Rectangulo(double base){
         
        this.base = base;
        this.altura = 25;
     }
     
   
    public double getBase(){
        return this.base;
    }
    
    public double getAltura(){
        return this.altura;
    }
    
    
    
    public void setBase(double base){
        this.base = base;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
 
    
    public double calcularArea(){
        return this.base * this.altura;
    }
    
    public double calcularPerimetro(){
        return 2*(this.altura + this.base);
    }
    
   
}
