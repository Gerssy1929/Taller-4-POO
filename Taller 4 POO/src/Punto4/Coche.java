package Punto4;
/*Crear una clase Coche, a través de la cual se pueda conocer el color del coche, la marca, el modelo, el número de
*caballos, el número de puertas y la matricula. Crear el constructor del coche, así como los métodos que considere
*necesarios. Crear una clase PruebaCoche que instancie varios coches, cambiándole el color a lo largo de la vida a
*algunos de ellos y mostrándolo por pantalla.
*package Punto4;
*/

public class Coche {
    
    //atributos
    private String color;
    private String marca;
    private String modelo;
    private int numcaballos;
    private int numpuertas;
    private String matricula;
    
    //Construcotr por default
    public Coche(){
        this.color="Rojo";
        this.marca="Ferrari";
        this.modelo="250 GT Berlinetta";
        this.numcaballos=260;
        this.numpuertas=2;
        this.matricula="ATX-728";
    }
    
    //Constructor Sobrecargado 1 
    public Coche(String color, String marca, String modelo, String matricula,int numcaballos){
        this.color=color;
        this.marca=marca;
        this.modelo=modelo;
        this.matricula=matricula;
        this.numcaballos=numcaballos;
        this.numpuertas=2;
    }
    
    //Constructor Sobrecargado 2
    public Coche(String color, String marca, String modelo){
        
        this.color=color;
        this.marca=marca;
        this.modelo=modelo;
        this.numcaballos=75;
        this.numpuertas=2;
        this.matricula="QWE-789";
        
    }
    
    //Constructor sobrecargado 3
    public Coche(int numcaballos, int numpuertas){
        
        this.color="Negro";
        this.marca="Audi";
        this.modelo="A6";
        this.numcaballos=numcaballos;
        this.numpuertas=numpuertas;
        this.matricula="JKL-147";
    }
    
    
    
    public String getcolor(){
        return this.color;
    }
    
    public String getmarca(){
        return this.marca;
    }
    
    public String getmodelo(){
        return this.modelo;
    }
    
    public int getnumcaballos(){
        return this.numcaballos;
    }
    
    public int getnumpuertas(){
        return this.numpuertas;
    }
    
    public String getmatricula(){
        return this.matricula;
    }
    
    
    //metodos setters
    
    public void setcolor(String color){
        this.color = color;
    }
    
    public void setmarca(String marca){
        this.marca = marca;
    }
    
    public void setmodelo(String modelo){
        this.modelo = modelo;
    }
    
    public void setmatricula(String matricula){
        this.matricula = matricula;
    }
    
    public void setnumcaballos(int numcaballos){
        this.numcaballos = numcaballos;
    }
    
     public void setnumpuertas(int numpuertas){
        this.numpuertas = numpuertas;
    }
    
}
