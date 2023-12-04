package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Bruno Urccella Wiss
 */
public class ControllerControleVendas {

    String query;

    public boolean inserirDado(String totalVenda, String valorPago, String desconto, String clienteId, String usuarioId) throws SQLException {
        query = "INSERT INTO historico_vendas(total_venda, valor_pago, desconto, cliente_id, usuario_id) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement stmt = ControllerJDBC.getConexao().prepareStatement(query);
        stmt.setString(1, totalVenda);
        stmt.setString(2, valorPago);
        stmt.setString(3, desconto);
        stmt.setString(4, clienteId);
        stmt.setString(5, usuarioId);

        return stmt.execute();

    }

    public boolean verificarClienteUsuario(String clienteId, String usuarioId) {
        query = "SELECT * FROM clientes WHERE id = ? AND usuario_id = ?";
        try (Connection conexao = ControllerJDBC.getConexao(); PreparedStatement stmt = conexao.prepareStatement(query)) {
            stmt.setString(1, clienteId);
            stmt.setString(2, usuarioId);

            try (ResultSet resultado = stmt.executeQuery()) {
                return resultado.next();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public boolean verificarId(String idProduto) {
        query = "SELECT * FROM historico_vendas WHERE id = ?";
        try (Connection conexao = ControllerJDBC.getConexao(); PreparedStatement stmt = conexao.prepareStatement(query);) {
            stmt.setString(1, idProduto);

            try (ResultSet resultado = stmt.executeQuery()) {
                return resultado.next();
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    // READ DO CRUD
    public ResultSet buscarDados() throws SQLException {
        query = "SELECT * FROM historico_vendas WHERE id = ?";
        Statement stmt = ControllerJDBC.getConexao().createStatement();

        return stmt.executeQuery(query);
    }

    // UPDATE DO CRUD
    public void atualizarDado(String totalVenda, String valorPago, String desconto, String clienteId, String usuarioId, String histId) throws SQLException {
        try (Connection conexao = ControllerJDBC.getConexao()) {
            query = "UPDATE historico_vendas SET total_venda = ?, valor_pago = ?, desconto = ?, cliente_id = ?, usuario_id = ? WHERE id = ?";
            try (PreparedStatement stmt = conexao.prepareStatement(query)) {
                stmt.setString(1, totalVenda);
                stmt.setString(2, valorPago);
                stmt.setString(3, desconto);
                stmt.setString(4, clienteId);
                stmt.setString(5, usuarioId);
                stmt.setString(6, histId);

                stmt.executeUpdate();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    //DELETE DO CRUD
    public int deletarDado(String id) throws SQLException {
        query = "DELETE FROM historico_vendas WHERE id = ?";
        PreparedStatement stmt = ControllerJDBC.getConexao().prepareStatement(query);
        stmt.setString(1, id);

        return stmt.executeUpdate();
    }

    public static boolean HistoricoId(String nome) {
        try (Connection conexao = ControllerJDBC.getConexao()) {
            String sql = "SELECT * FROM historico_vendas WHERE id = ?";
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
