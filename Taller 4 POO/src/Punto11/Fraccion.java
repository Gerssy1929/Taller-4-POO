
package Punto11;


public class Fraccion {
    
    private int num;
    private int den;
    
    
    public Fraccion(){
        this.num = 2;
        this.den=5; 
    }
    
    public Fraccion(int num, int den){
        
        this.num = num;
        this.den= den;
    }
    
    public Fraccion(int num){
        
        this.num = num;
        this.den = 3;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }
    
    public Fraccion suma(Fraccion f){
        Fraccion g = new Fraccion ();
        g.num = this.num * f.den + this.den * f.num;
        g.den = this.den * f.den;
        g.simplificar();  //se simplifica antes de devolverla                                                   
        return g;
    }
    
    public Fraccion resta(Fraccion f) {
        Fraccion g = new Fraccion();
        g.num = this.num * f.den - this.den * f.num;
        g.den = this.den * f.den;
        g.simplificar();  //se simplifica antes de devolverla
        return g;
}
    public Fraccion multiplicacion(Fraccion f) {
        Fraccion g = new Fraccion();
        g.num = this.num * f.num;
        g.den = this.den * f.den;
        g.simplificar();  //se simplifica antes de devolverla
        return g;
    }
    
    public Fraccion division(Fraccion f) {
        Fraccion g = new Fraccion();
        g.num = this.num * f.den;
        g.den = this.den * f.num;
        g.simplificar();  //se simplifica antes de devolverla
        return g;
    }
    
     private int mcd() {
        int z = Math.abs(num); //valor absoluto del numerador
        int x = Math.abs(den); //valor absoluto del denominador
        if (x == 0) {
            return z;
        }
        int r;
        while (x != 0) {
            r = z % x;
            z = x;
            x = r;
        }
        return z;
    }
    
    
    private void simplificar() {
        int n = mcd(); //se calcula el mcd de la fracción
        num = num / n;
        den = den / n;
    }
    
    @Override
    public String toString() {
        simplificar();
        return num + "/" + den;
    }    
    
    
}
    


    

