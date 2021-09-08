
package Punto2;

import java.util.Scanner;


public class testEcuacion {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Valor de X=");
        int x = entrada.nextInt();
        
        Ecuacion a = new Ecuacion();
       
        a.setA(6);
        a.setB(2);
        a.setC(4);
        
        System.out.printf("Y(%d) = %.2f%n", x, a.evaluarEcuacion(x));
        
        
        Ecuacion b = new Ecuacion(4);
        System.out.printf("* Y(%d) = %.2f%n", x, b.evaluarEcuacion(x));
        
        Ecuacion c = new Ecuacion(5,3);
        System.out.printf("** Y(%d) = %.2f%n", x, c.evaluarEcuacion(x));
        
        
    }
    }

