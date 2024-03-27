package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Bruno Urccella Wiss
 */
public class AutenticacaoAgendamentos {

    public static boolean getConfirmarAgendamento(String nome) {
        try (Connection conexao = ControllerJDBC.getConexao()) {
            String sql = "SELECT * FROM agendamentos WHERE nome = ?";
            try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                stmt.setString(1, nome);

                try (ResultSet busca = stmt.executeQuery()) {
                    return busca.next();
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static boolean getConfirmarAgendamentoDel(String nome) {
        try (Connection conexao = ControllerJDBC.getConexao()) {
            String sql = "SELECT * FROM agendamentos WHERE nome = ?";
            try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                stmt.setString(1, nome);

                try (ResultSet busca = stmt.executeQuery()) {
                    return busca.next();
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

}
