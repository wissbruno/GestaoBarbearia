package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Bruno Urccella Wiss
 */
public class AutenticacaoLogin {

    public static boolean getRealizarLogin(String usuario, String senha) {
        try (Connection conexao = ControllerJDBC.getConexao()) {
            String sql = "SELECT * FROM usuario WHERE usuario = ? AND senha = ?";
            try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                stmt.setString(1, usuario);
                stmt.setString(2, senha);

                try (ResultSet busca = stmt.executeQuery()) {
                    return busca.next();
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public String getPerfil(String usuario, String senha) {
        try (Connection conexao = ControllerJDBC.getConexao()) {
            String sql = "SELECT perfil FROM usuario WHERE usuario = ? AND senha = ?";
            try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                stmt.setString(1, usuario);
                stmt.setString(2, senha);

                try (ResultSet busca = stmt.executeQuery()) {
                    if (busca.next()) {
                        return busca.getString("perfil");
                    } else {
                        return "PERFIL_PADRAO";
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace(); 
            return null; 
        }
    }

}
