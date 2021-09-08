
package Punto11;


public class operfracciones {
    
    public static void main(String[] args) {
        
        Fraccion a = new Fraccion (2);
        fraccionevaluada(a);
        
        Fraccion b = new Fraccion(1,4);
        fraccionevaluada(b);
        
        
      
        //Operaciones
        
        Fraccion suma = a.suma(b);
        Fraccion resta = a.resta(b);
        Fraccion producto = a.multiplicacion(b);
        Fraccion cociente = a.division(b);
    
    
        System.out.println(a + " + " + b + " = " + suma);
        System.out.println(a + " - " + b + " = " + resta);
        System.out.println(a + " * " + b + " = " + producto);
        System.out.println(a + " / " + b + " = " + cociente);
}
    
     public static void fraccionevaluada(Fraccion f){
         
         System.out.println("La fracción es: "+f.getNum()+ " / " + f.getDen());
    }
}  
