
package Punto1;


public class testRectangulo {
    
    public static void main(String[] args) {
        
        Rectangulo a = new Rectangulo();
        imprimirInfoRectangulo(a);
        
        Rectangulo b = new Rectangulo(14,23);
        imprimirInfoRectangulo(b);
        
        b.setBase(30);
        imprimirInfoRectangulo(b);
        
        Rectangulo c = new Rectangulo(40);
        imprimirInfoRectangulo(c);
        
        c.setAltura(50);
        imprimirInfoRectangulo(c);
        
        
    }
    
    public static void imprimirInfoRectangulo(Rectangulo r){
        System.out.println("Base: " + r.getBase());
        System.out.println("Altura: " + r.getAltura());
        System.out.println("Color: "+ Rectangulo.COLOR);
        System.out.println("Area: " + r.calcularArea());
        System.out.println("Perimetro: "+r.calcularPerimetro());
        System.out.println("--------------------------------");
    }
    }
