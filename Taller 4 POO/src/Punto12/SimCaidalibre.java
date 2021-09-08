
package Punto12;


public class SimCaidalibre {
    
    public static void main(String[] args) {
        
         Caidalibre a = new Caidalibre();
        pruebacaidalibre(a);
        
        
        Caidalibre b = new Caidalibre(5.6);
        pruebacaidalibre(b);
        
       
        
    }
        
        public static void pruebacaidalibre(Caidalibre p){
        System.out.println("Tiempo: " + p.getTiempo()+" seg");
        System.out.println("Gravedad: " + p.gravedad);
        System.out.println("Distancia recorrida: " + p.distanciarecorrida()+" mts");
        System.out.println("Velocidad final: "+p.velocidadfinal()+" m/s");
        System.out.println("--------------------------------");
    
    }
}
