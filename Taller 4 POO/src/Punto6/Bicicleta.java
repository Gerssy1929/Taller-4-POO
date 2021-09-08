
package Punto6;



public class Bicicleta {
    
    private int velocidadActual;
    private int platoActual;
    private int piñonActual;
    
    public Bicicleta(){
        
    }
    
    public Bicicleta(int velocidadActual, int platoActual, int piñonActual){
        
        this.velocidadActual=velocidadActual;
        this.platoActual=platoActual;
        this.piñonActual=piñonActual;    
    }
    
     public Bicicleta(int velocidadActual, int platoActual){
         
        this.velocidadActual=velocidadActual;
        this.platoActual=platoActual;
        this.piñonActual=2;
     }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public int getPlatoActual() {
        return platoActual;
    }

    public void setPlatoActual(int platoActual) {
        this.platoActual = platoActual;
    }

    public int getPiñonActual() {
        return piñonActual;
    }

    public void setPiñonActual(int piñonActual) {
        this.piñonActual = piñonActual;
    }
    
    public int acelerar(){
        return this.velocidadActual * 2;   
    }
    
    public float frenar(){
        return (float) this.velocidadActual / 2;
    }
    
    public int cambiarplato(int plato){
        return this.platoActual=plato;
    }
    
    public int cambiarpiñon(int piñon){
        return this.platoActual=piñon;
    }
            
}
