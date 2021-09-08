
package Punto9;


public class usoscuenta {
    
    public static void main(String[] args) {
        
        Cuenta a = new Cuenta(285);
        instanciacuenta(a);
    
    
        Cuenta b = new Cuenta(286, "Kelly Fuentes");
        instanciacuenta(b);
        
        b.setNombreCliente("Maria Fuentes");
        b.setSaldo(5000000);
        instanciacuenta(b);
    }
    
         
    
    
    
    public static void instanciacuenta(Cuenta c){
        System.out.println("Su número de Cuenta es: " + c.getNoCuenta());
        System.out.println("Su Nombre es: " + c.getNombreCliente());
        System.out.println("Su Saldo actual es: " + c.getSaldo()+"\n");
        System.out.println("La consignación se efectuó de manera: "+ c.consignar(4500000));
        System.out.println("El retiro se efectuó de manera: " + c.retirar(2000000));
        System.out.println("--------------------------------");
}
}
