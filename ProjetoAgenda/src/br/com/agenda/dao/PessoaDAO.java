package br.com.agenda.dao;

import br.com.agenda.conection.ConnectionFactory;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PessoaDAO {

    private String queryPessoas = "SELECT * FROM PESSOA";
    private String sqlInsert = "INSERT INTO pessoa (nome, dt_nascimento, sexo) VALUES (1,2,3)";

    public ArrayList<String[]> getDadosPessoaToTable() {
        ArrayList<String[]> dadosPessoas = new ArrayList();
        Connection cnn = ConnectionFactory.getConnection();

        try {
            PreparedStatement pstm = cnn.prepareStatement(queryPessoas);

            ResultSet rsPessoas = pstm.executeQuery();

            while (rsPessoas.next()) {
                dadosPessoas.add(new String[]{rsPessoas.getString("id"), rsPessoas.getString("nome"), rsPessoas.getString("sexo"), rsPessoas.getString("dt_nascimento")});
            }
            cnn.close();
            return dadosPessoas;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Erro de SQL", JOptionPane.ERROR_MESSAGE);
        }
        return null;

    }

    public int insertPessoa(String nome, String data_nascimento, String sexo) {
        Connection cnn = ConnectionFactory.getConnection();

        try {

            PreparedStatement stm = cnn.prepareStatement(sqlInsert);
            stm.setString(1, nome);
            stm.setString(2, data_nascimento);
            stm.setString(3, sexo);

            return stm.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Erro de SQL", JOptionPane.ERROR_MESSAGE);
        }
        return 0;
    }

}
