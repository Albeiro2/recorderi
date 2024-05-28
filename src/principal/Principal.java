
package principal;

import controlador.Controlador;
import java.util.ArrayList;
import modelo.Operador;
import modelo.Producto;
import vista.Vista;


public class Principal {
    
    public static void main(String[] args) {
        
        ArrayList<Producto> productos = new ArrayList();
        Operador operador = new Operador();
        Vista vista = new Vista();
        
        Controlador control = new Controlador(operador, productos, vista);
        control.start();
    }
}
