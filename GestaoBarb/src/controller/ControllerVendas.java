package controller;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

/**
 *
 * @author Bruno Urccella Wiss 
 */
public class ControllerVendas {

    private String query;

    // CREATE DO CRUD
    public boolean inserirDado(String nome, String descricao, String preco, String quantidade) throws SQLException {
        query = "INSERT INTO produto(nome, descricao, preco, quantidade) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = ControllerJDBC.getConexao().prepareStatement(query);
        stmt.setString(1, nome);
        stmt.setString(2, descricao);
        stmt.setString(3, preco);
        stmt.setString(4, quantidade);

        return stmt.execute();

    }

    public boolean verificarId(String idProduto) {
        query = "SELECT * FROM produto WHERE id = ?";
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

    public BigDecimal getPrecoProduto(String nomeProduto) {
        BigDecimal preco = null;
        String query = null;

        try (Connection conexao = ControllerJDBC.getConexao()) {
            query = "SELECT preco FROM produto WHERE nome = ?";

            try (PreparedStatement stmt = conexao.prepareStatement(query)) {
                stmt.setString(1, nomeProduto);

                try (ResultSet resultado = stmt.executeQuery()) {
                    if (resultado.next()) {
                        preco = resultado.getBigDecimal("preco");
                    } else {
                        System.out.println("Nenhum resultado encontrado para o produto: " + nomeProduto);
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao obter preço do produto: " + e.getMessage());
        }

        return preco;
    }

    public BigDecimal getPrecoServicos(String nomeServico) {
        BigDecimal preco = null;
        try (Connection conexao = ControllerJDBC.getConexao()) {
            query = "SELECT preco FROM servicos WHERE nome = ?";

            try (PreparedStatement stmt = conexao.prepareStatement(query)) {
                stmt.setString(1, nomeServico);

                try (ResultSet resultado = stmt.executeQuery()) {
                    if (resultado.next()) {
                        preco = resultado.getBigDecimal("preco");
                    } else {
                        System.out.println("Nenhum resultado encontrado para o serviço: " + nomeServico);
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao obter preço do serviço: " + e.getMessage());
        }

        return preco;
    }

    // READ DO CRUD
    public ResultSet buscarDados() throws SQLException {
        query = "SELECT * FROM produto WHERE id = ?";
        Statement stmt = ControllerJDBC.getConexao().createStatement();

        return stmt.executeQuery(query);
    }

    // UPDATE DO CRUD
    public void atualizarDado(String nome, String descricao, String preco, String quantidade, String idProduto) throws SQLException {
        try (Connection conexao = ControllerJDBC.getConexao()) {
            query = "UPDATE produto SET nome = ?, descricao = ?, preco = ?, quantidade = ? WHERE id = ?";
            try (PreparedStatement stmt = conexao.prepareStatement(query)) {
                stmt.setString(1, nome);
                stmt.setString(2, descricao);
                stmt.setString(3, preco);
                stmt.setString(4, quantidade);
                stmt.setString(5, idProduto);

                stmt.executeUpdate();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void atualizarQuantidade(String quantidade, String idProduto) throws SQLException {
        try (Connection conexao = ControllerJDBC.getConexao()){
            query = "UPDATE produto SET quantidade = ? WHERE id = ?";
            try (PreparedStatement stmt = conexao.prepareStatement(query)) {
                stmt.setString(1, quantidade);
                stmt.setString(2, idProduto);
                
                stmt.executeUpdate();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    //DELETE DO CRUD
    public int deletarDado(String id) throws SQLException {
        query = "DELETE FROM produto WHERE id = ?";
        PreparedStatement stmt = ControllerJDBC.getConexao().prepareStatement(query);
        stmt.setString(1, id);

        return stmt.executeUpdate();
    }
}
