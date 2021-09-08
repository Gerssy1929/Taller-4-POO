
package Punto3;


public class testHabitacion {
    
    public static void main(String[] args) {
        Habitacion a = new Habitacion();
        imprimirHabitacion(a);
        
        Habitacion b = new Habitacion(25,10);
        imprimirHabitacion(b);
        
        Habitacion c = new Habitacion(35);
        imprimirHabitacion(c);
        
        c.setancho(26);
        imprimirHabitacion(c);
    }
    
    public static void  imprimirHabitacion(Habitacion h){
        System.out.println("Largo: " + h.getlargo());
        System.out.println("Ancho: " +h.getancho());
        System.out.println("Alto: " + h.getaltura());
        System.out.println("Tapizado: " + h.tapizarparedes()+" metros cuadrados");
        System.out.println("Enchape: " + h.enchapepiso()+" metros cuadrados");
        System.out.println("-----------------------------");
    }
    }

