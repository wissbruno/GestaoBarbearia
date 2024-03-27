package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Bruno Urccella Wiss 
 */
public class AutenticacaoVendas {

    public static boolean getConfirmarID(String id) {
        try (Connection conexao = ControllerJDBC.getConexao()) {
            String sql = "SELECT * FROM produto WHERE id = ?";
            try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                stmt.setString(1, id);

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
