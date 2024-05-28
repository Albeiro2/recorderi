
package modelo;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.util.ArrayList;
public class Operador {
    
    public boolean mostrarProducto(ArrayList<Producto> productos){
        
        ResultSet rs;
        PreparedStatement ps;
        Conexion con = new Conexion();
        Producto producto;
        
        try {
            Connection conexion = con.getConnection();
            ps = conexion.prepareStatement("select * from producto");
            rs = ps.executeQuery();
            
           while(rs.next()){
                producto = new Producto();
                producto.setId(rs.getInt(1));
                producto.setNombre(rs.getString(2));
                producto.setPrecio(rs.getDouble(3));
                
                productos.add(producto);
                
           }
              
            
            rs.close();
            
            return true;
            
        } catch (Exception e) {
            System.err.println("Error, "+e);
            return false;        
        }
    }
}
