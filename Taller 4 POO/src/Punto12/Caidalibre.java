
package Punto12;


public class Caidalibre {
    
    public final double gravedad = 9.8;
    private double tiempo;
    
    
    public Caidalibre(){
        this.tiempo=2;
    }
    
    //constructor sobrecargado 1
    public Caidalibre(double tiempo){
        
        this.tiempo=tiempo;
        
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }
    
    
    public double distanciarecorrida(){
        double num=Math.pow(this.tiempo, 2);
        return (this.gravedad * num)/2;             
    }
    
    
    public double velocidadfinal(){
        return this.gravedad * this.tiempo;
    }
    
}
