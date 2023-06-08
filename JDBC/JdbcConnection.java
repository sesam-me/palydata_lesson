package config;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
// Connection은 싱글톤하면 안됨
    private final String url = "jdbc:mysql://localhost:3306/test2" + "?serverTimezone=Asia/Seoul&characterEncoding=UTF-8";
    private String root = "root";
    private String password = "1q2w3e4r!!";

    public Connection getJdbc() {
        Connection conn;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, root, password);
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

//        System.out.println("연동 성공");

        return conn;
    }

}
