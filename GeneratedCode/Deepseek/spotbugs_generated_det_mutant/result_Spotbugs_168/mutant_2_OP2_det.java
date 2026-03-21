import java.sql.*;

class SQLInjection {
public String showBug(String userInput)throws SQLException {
    String sql = "SELECT * FROM users WHERE username = '" + userInput + "'";
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb" , "username" , "password");
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery(sql);
    rs = stmt.executeQuery(sql);
    String result = "";
    while(rs.next()){ result += rs.getString("username"); }
    return result;
}
}