
package Punto9;


public class Cuenta {
    
    private int noCuenta;
    private String nombreCliente;
    private double saldo;


public Cuenta(){

}

public Cuenta(int noCuenta){
    
    this.noCuenta = noCuenta;
    this.nombreCliente = "German Ardila";
    this.saldo=8500000;
}

public Cuenta(int noCuenta, String nombreCliente){
    
    this.noCuenta = noCuenta;
    this.nombreCliente = nombreCliente;
    this.saldo=4000000;
}
        
        

    public int getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(int noCuenta) {
        this.noCuenta = noCuenta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public  boolean consignar (double monto){
        boolean c;
        if (monto<this.saldo){
            c=true;   
        }else{
            c=false;
        }  
         return c;   
    }
    
    public boolean retirar (double monto){

    boolean r;
    
        if (monto<this.saldo){
            r=true;
        }else{
            r=false;
        }
        return r;
    }
}

