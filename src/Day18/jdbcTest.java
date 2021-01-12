package Day18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql-learn?serverTimezone=UTC", "root", "root");
        String sql = "insert into student values (114,'tommy',20)";
        Statement stmt = connection.createStatement();
        int count = stmt.executeUpdate(sql);
        System.out.println(count);
        stmt.close();
        connection.close();
    }
}
