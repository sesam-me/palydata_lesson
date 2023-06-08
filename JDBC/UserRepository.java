package repository;

import config.JdbcConnection;
import domain.entity.Me;
import domain.dto.SignupDto;

import java.sql.*;

public class UserRepository {

    public static Me me;

    public boolean login(String id, String password) throws SQLException {
        Connection conn = new JdbcConnection().getJdbc(); // DB와 Connection을 만들어 줌
        String sql = "select * from users " + "where username = ? and password = ?";

        Integer id1 = null; //
        String name = null;

        try {
            PreparedStatement psmt = conn.prepareStatement(sql);
            psmt.setString(1,id); // 1번째에 id를 넣고
            psmt.setString(2,password);  // 2번째에 p2넣겠다.
            ResultSet resultSet = psmt.executeQuery(); // ctrl+alt+v
            while (resultSet.next()){ // id, name 입력한 값으로 넣어준다.
                id1 = resultSet.getInt("id");
                name = resultSet.getString("name");
                me = new Me(id1, name);
                System.out.println(id1 + " " + name);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        try{
            conn.close();
        } catch (SQLException e) {
            System.out.println("connection close fail");
        }
        return id1!=null;
    }



    public void insertUsers(SignupDto dto){
        Connection conn = new JdbcConnection().getJdbc();
        String sql = "insert into users(username, password, name)\n" +
                "values(?,?,?);";

        try {
            PreparedStatement psmt = conn.prepareStatement(sql);
            psmt.setString(1, dto.getUsername()); // 1번째에 id를 넣고
            psmt.setString(2, dto.getPassword());  // 2번째에 p2넣겠다.
            psmt.setString(3, dto.getName());  // 2번째에 p2넣겠다.
//            ResultSet resultSet = psmt.executeQuery(); // ctrl+alt+v
            if(psmt.executeUpdate() != 0){  // 이 쿼리를 실행했을 때 얼마나 바뀌었냐....?
                System.out.println("insertUser err");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


        try{
            conn.close();
        } catch (SQLException e) {
            System.out.println("connection close fail");
        }
    }
}







