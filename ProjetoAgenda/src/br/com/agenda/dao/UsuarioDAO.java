package br.com.agenda.dao;

import br.com.agenda.beans.Usuario;
import br.com.agenda.conection.ConnectionFactory;
import java.sql.*;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    private String queryLogin = "SELECT * FROM USUARIO WHERE LOGIN = ? and SENHA = ?";

    public Usuario fazerLogin(String login, String senha) {
        Connection cnn = ConnectionFactory.getConnection();
        Usuario usuarioLogin = new Usuario();

        try {
            PreparedStatement pstm = cnn.prepareStatement(queryLogin);
            pstm.setString(1, login);
            pstm.setString(2, senha);

            ResultSet rsLogin = pstm.executeQuery();

          
            if(rsLogin != null) {
                while (rsLogin.next()) {
                    usuarioLogin = new Usuario(rsLogin.getString("login"), rsLogin.getString("senha"));
                    usuarioLogin.setId(rsLogin.getInt("id"));
                    usuarioLogin.setId_pessoa(rsLogin.getInt("id_pessoa"));
                }
                return usuarioLogin;
            } else {
                return null;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Erro de SQL", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

}
