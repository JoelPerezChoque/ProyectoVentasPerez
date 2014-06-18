

package pe.edu.upeu.proyectoventas.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import pe.edu.upeu.proyectoventas.config.Conexion;

public class ProductoDAO {
    private Connection cx;
    private Statement st;
    private ResultSet rs;
    private String sql;    
    int op=0;
    
    public int registrarProducto(int idc,String pro,double pre,int can){
        sql="INSERT INTO Producto VALUES(null,'"+pro+"','"+pre+"','"+can+"','"+idc+"')";
            try{
            cx=Conexion.GetConexion();
            st=cx.createStatement();
            op=st.executeUpdate(sql);
            cx.close();
            }
            catch(SQLException |ClassNotFoundException ex){
                JOptionPane.showMessageDialog(null,"error:" + ex);
            
        }
           return op;
    
    }
}
