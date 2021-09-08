
package Punto3;


public class Habitacion {
    
    private int largo;
    private int ancho;
    private int altura;

     //Constructor default
    public Habitacion(){
        this.largo=20;
        this.ancho=12;
        this.altura=15;
    }
    
    //Constructor sobrecargado 1
    public Habitacion(int largo, int ancho){
        this.largo=largo;
        this.ancho=ancho;
        this.altura=14;
    }
    
    //Constructor sobrecargado 2
     public Habitacion(int altura){
        this.largo=40;
        this.ancho=23;
        this.altura=altura;
    }

    public int getlargo(){
        return this.largo;
    }
    
    public int getancho(){
        return this.ancho;
    }
    
    public int getaltura(){
        return this.altura;
    }
    
    public void setlargo(int largo){
        this.largo = largo;
    }
    
    public void setancho(int ancho){
        this.ancho = ancho;
    }
    
    public void setaltura(int altura){
        this.altura = altura;
    }
    
    
    public int enchapepiso(){
        return this.largo * this.ancho;
    }
    
    public int tapizarparedes(){
        return 2*(this.altura*this.ancho) + 2 * (this.altura*this.largo);
    }


}



