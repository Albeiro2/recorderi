
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import modelo.Operador;
import modelo.Producto;
import vista.Vista;


public class Controlador implements ActionListener {
    
    private Operador operador;
    private ArrayList<Producto> productos;
    private Vista vista;
    
    public Controlador(Operador operador, ArrayList<Producto> productos,Vista vista){
        this.operador = operador;
        this.productos = productos;
        this.vista = vista;
        
        vista.botonMostrar.addActionListener(this);
    }
    
    public void start(){
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == vista.botonMostrar){
          
           operador.mostrarProducto(productos);
           DefaultComboBoxModel modelo = new DefaultComboBoxModel();
           vista.combo.setModel(modelo);
           for(Producto producto: productos){
               modelo.addElement(producto);
           }
         
       }
    }
    
}
