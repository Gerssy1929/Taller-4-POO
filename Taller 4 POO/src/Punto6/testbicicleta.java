
package Punto6;


public class testbicicleta {
    
    public static void main(String[] args) {
        
        Bicicleta a = new Bicicleta(35, 1, 5);
        instanciabicicleta(a);
        
        Bicicleta b = new Bicicleta(27, 1);
        instanciabicicleta(b);
        
        b.setVelocidadActual(20);
        b.setPlatoActual(4);
        instanciabicicleta(b);
    }
    










public static void instanciabicicleta(Bicicleta b){
        System.out.println("Velocidad Actual: " + b.getVelocidadActual()+" Km/h");
        System.out.println("Plato Actual: " + b.getPlatoActual());
        System.out.println("Piñon Actual: " + b.getPiñonActual()+"\n");
        System.out.println("La velocidad al acelerar será de: "+ b.acelerar()+" Km/h");
        System.out.println("La velocidad al frenar será de: " + b.frenar()+" Km/h");
        System.out.println("El nuevo plato será: " + b.cambiarplato(2));
        System.out.println("El nuevo piñón será: " + b.cambiarpiñon(6)); 
        System.out.println("--------------------------------");
}
}