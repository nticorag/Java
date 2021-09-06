
package Biblioteca.Controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Biblioteca.Modelo.Conexion;
import Biblioteca.Modelo.bibliotecaE;
import Biblioteca.PasswordUtils;
 
public class Usuario {
 
    public static void registrarUsuario(String n,String u,String p,int id) throws SQLException {
 
        String llave = PasswordUtils.getSalt(10);
        String clave = PasswordUtils.generateSecurePassword(p, llave);
        System.out.println(llave);
        System.out.println(clave);
 
        Connection con = Conexion.getConexion();
        String query = "INSERT INTO empleados (usuario, clave, llave, estado, nombre,tipo_usuario_idtipo_usuario,bibliotecas_idbibliotecas) VALUES (?,?,?,?,?,?,?);";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, u);
        ps.setString(2, clave);
        ps.setString(3, llave);
        ps.setInt(4, 1);
        ps.setString(5, n);
        ps.setInt(6, 2);
        ps.setInt(7, id);
        
        ps.executeUpdate();
    
 
        con.close();
 
    }
 
    public static boolean validarUsuario(String usuario) throws SQLException{
        Connection con = Conexion.getConexion();
        String query = "select usuario from empleados where usuario=?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, usuario);
        ResultSet data = ps.executeQuery();

        boolean bandera = data.next();

        con.close();
        return bandera;
    }


}