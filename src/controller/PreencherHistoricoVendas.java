package controller;

/**
 *
 * @author Bruno
 */
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.math.BigDecimal;

public class PreencherHistoricoVendas {

    // Método para preencher a tabela historico_vendas
    public static void preencherHistoricoVendas(BigDecimal totalVenda, BigDecimal valorPago, BigDecimal desconto,
            boolean clienteId, int usuarioId) {
        // Instrução SQL para inserção
        String query = "INSERT INTO historico_vendas (total_venda, valor_pago, desconto, cliente_id, usuario_id) "
                + "VALUES (?, ?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = ControllerJDBC.getConexao().prepareStatement(query)) {
            preparedStatement.setBigDecimal(1, totalVenda);
            preparedStatement.setBigDecimal(2, valorPago);
            preparedStatement.setBigDecimal(3, desconto);
            preparedStatement.setBoolean(4, clienteId);
            preparedStatement.setInt(5, usuarioId);

            preparedStatement.executeUpdate();

            System.out.println("Registro inserido com sucesso na tabela historico_vendas.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
