import config.JdbcConnection;
import controller.Controller;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        new Controller().selectMode();
    }
}
