
package br.com.agenda.conection;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class ConnectionFactory {
   
    public static Connection getConnection(){
        String url = "jdbc:mysql://localhost:3306/agenda?useTimezone=true&serverTimezone=UTC";
        String user = "root";
        String password = "root";
        
        try {
        Connection cnn = DriverManager.getConnection(url, user, password);
            
        return cnn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Erro de conexão", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
