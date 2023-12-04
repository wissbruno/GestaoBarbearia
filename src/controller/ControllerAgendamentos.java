package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Bruno Urccella Wiss 
 */
public class ControllerAgendamentos {

    private String query;

    // CREATE DO CRUD
    public boolean inserirDado(String nome, String telefone, String data) throws SQLException {
        query = "INSERT INTO agendamentos(nome, telefone, data) VALUES (?, ?, ?)";
        PreparedStatement stmt = ControllerJDBC.getConexao().prepareStatement(query);
        stmt.setString(1, nome);
        stmt.setString(2, telefone);
        stmt.setString(3, data);

        return stmt.execute();

    }

    public boolean verificarAgendamentoExistente(String dataHora) throws SQLException {
        query = "SELECT COUNT(*) FROM agendamentos WHERE data = ?";
        PreparedStatement stmt = ControllerJDBC.getConexao().prepareStatement(query);
        stmt.setString(1, dataHora);

        try (ResultSet resultSet = stmt.executeQuery()) {
            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                return count > 0;
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }
        return false;
    }

    public boolean verificarId(String idCliente) throws SQLException {
        query = "SELECT * FROM agendamentos WHERE id = ?";
        PreparedStatement stmt = ControllerJDBC.getConexao().prepareStatement(query);
        stmt.setString(1, idCliente);

        try (ResultSet resultado = stmt.executeQuery()) {
            return resultado.next();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    // READ DO CRUD
    public ResultSet buscarDados() throws SQLException {
        query = "SELECT * FROM agendamentos";
        Statement stmt = ControllerJDBC.getConexao().createStatement();

        return stmt.executeQuery(query);
    }

    // UPDATE DO CRUD
    public void atualizarDado(String nome, String telefone, String dataHora, String idCliente) throws SQLException {
        query = "UPDATE agendamentos SET nome = ?, telefone = ?, data = ? WHERE id = ?";
        PreparedStatement stmt = ControllerJDBC.getConexao().prepareStatement(query);
        try {
            stmt.setString(1, nome);
            stmt.setString(2, telefone);
            stmt.setString(3, dataHora);
            stmt.setString(4, idCliente);

            stmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    //DELETE DO CRUD
    public int deletarDado(String nome) throws SQLException {
        query = "DELETE FROM agendamentos WHERE nome = ?";
        PreparedStatement stmt = ControllerJDBC.getConexao().prepareStatement(query);
        stmt.setString(1, nome);

        return stmt.executeUpdate();
    }
}
