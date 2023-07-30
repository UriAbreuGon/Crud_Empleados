
package empleados_crud;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Anderson
 */
public class ConexionMySQL {
    Connection cn;
    
    public Connection conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/empleadoss_departamentoss","root", "");
            System.out.println("Conectado");
             
        } catch (Exception e){
            System.out.println("Error " + e);
        }
        return cn;
    
    }
    
}
 