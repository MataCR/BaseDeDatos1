/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bases.conexion;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luisg
 */
public class Progra2BasesConexion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        conectar con = null;  

               try {
          // TODO add your handling code here:
            con = new conectar();
        } catch (SQLException ex) {
            
        }
        Connection reg = con.getConnection();
    }
    
}
