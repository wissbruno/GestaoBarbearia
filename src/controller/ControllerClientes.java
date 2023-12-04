package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Bruno Urccella Wiss
 */
public class ControllerClientes {
    
        public long getId() throws SQLException {
        String query = "SELECT id FROM cliente WHERE nome = ?";
        String nomeCliente = "Carlos";

        long idCliente = -1;

        try (PreparedStatement pstmt = ControllerJDBC.getConexao().prepareStatement(query)) {
            pstmt.setString(1, nomeCliente);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    idCliente = rs.getLong("id");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return idCliente;
    }
}
