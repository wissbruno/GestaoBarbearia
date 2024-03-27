package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

/**
 *
 * @author Bruno Urccella Wiss
 */
public class ControllerUsers {

    private String query;

    // CREATE DO CRUD
    public boolean inserirDado(String nome, String usuario, String senha, String perfil) throws SQLException {
        query = "INSERT INTO usuario(nome, usuario, senha, perfil) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = ControllerJDBC.getConexao().prepareStatement(query);
        stmt.setString(1, nome);
        stmt.setString(2, usuario);
        stmt.setString(3, senha);
        stmt.setString(4, perfil);

        return stmt.execute();

    }

    public void deletarHistoricoVendas(String usuarioId) throws SQLException {
        Connection connection = null;
        PreparedStatement stmt = null;

        try {
            connection = ControllerJDBC.getConexao();

            connection.setAutoCommit(false);

            String sql = "DELETE FROM historico_vendas WHERE usuario_id = ?";
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuarioId);

            stmt.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            if (connection != null) {
                connection.rollback();
            }
            throw e;
        }
    }

    public boolean verificarId(String idUser) throws SQLException {
        query = "SELECT * FROM usuario WHERE id = ?";
        PreparedStatement stmt = ControllerJDBC.getConexao().prepareStatement(query);
        stmt.setString(1, idUser);

        try (ResultSet resultado = stmt.executeQuery()) {
            return resultado.next();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean verificarNomeUsuarioExistente(String usuario) {
        try (Connection conexao = ControllerJDBC.getConexao()) {
            String sql = "SELECT COUNT(*) AS count FROM usuario WHERE usuario = ?";
            try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
                stmt.setString(1, usuario);

                try (ResultSet resultado = stmt.executeQuery()) {
                    if (resultado.next()) {
                        int count = resultado.getInt("count");
                        return count > 0;
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
        return false;
    }

    public static boolean getConfirmarUsuarioDel(String id) {
        try (Connection conexao = ControllerJDBC.getConexao()) {
            String query = "SELECT * FROM usuario WHERE id = ?";
            try (PreparedStatement stmt = conexao.prepareStatement(query)) {
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

    // READ DO CRUD
    public ResultSet buscarDados() throws SQLException {
        query = "SELECT * FROM usuario";
        Statement stmt = ControllerJDBC.getConexao().createStatement();

        return stmt.executeQuery(query);
    }

    // UPDATE DO CRUD
    public int atualizarDado(String id, String nome, String usuario, String senha, String perfil) throws SQLException {
        query = "UPDATE usuario SET nome = ?, usuario = ?, senha = ? , perfil = ? WHERE id = ?";
        PreparedStatement stmt = ControllerJDBC.getConexao().prepareStatement(query);
        stmt.setString(1, nome);
        stmt.setString(2, usuario);
        stmt.setString(3, senha);
        stmt.setString(4, id);
        stmt.setString(5, perfil);

        return stmt.executeUpdate(nome);
    }

    //DELETE DO CRUD
    public int deletarDado(String id) throws SQLException {
        query = "DELETE FROM usuario WHERE id = ?";
        PreparedStatement stmt = ControllerJDBC.getConexao().prepareStatement(query);
        stmt.setString(1, id);

        return stmt.executeUpdate();
    }
}
