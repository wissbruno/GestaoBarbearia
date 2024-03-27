package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class HistoricoVendasDAO {

    // Método para obter todo o histórico de vendas
    public ResultSet obterHistoricoVendas() throws SQLException {

        try {
            String query = "SELECT * FROM historico_vendas";
            PreparedStatement stmt = ControllerJDBC.getConexao().prepareStatement(query);
            return stmt.executeQuery();
        } catch (SQLException e){
            System.out.println(e.getMessage());
        } return null;
    }

}
