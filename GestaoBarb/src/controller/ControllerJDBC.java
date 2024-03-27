package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Bruno Urccella Wiss
 */
public class ControllerJDBC {

    public static Connection getConexao() {
        try {
            final String url = "jdbc:mysql://localhost/gestao_barbearia";
            final String user = "root";
            final String senha = "root";

            return DriverManager.getConnection(url, user, senha);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
