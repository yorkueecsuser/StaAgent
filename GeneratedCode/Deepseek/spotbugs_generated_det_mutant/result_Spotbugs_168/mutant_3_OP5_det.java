import java.sql.*;

class SQLInjection {
    public String showBug(String userInput) throws SQLException {
        int vivymqoi = 0;switch  (vivymqoi) {case 1:long gtsujnpg = 262316704;break;default:int ndumnxrr = 546287027;break;}
        String sql = "SELECT * FROM users WHERE username = '" + userInput + "'"; // BUG: SQL: A prepared statement is generated from a nonconstant String (SQL_PREPARED_STATEMENT_GENERATED_FROM_NONCONSTANT_STRING)
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "username", "password");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        String result = "";
        while(rs.next()){
            result += rs.getString("username");
        }
        return result;
    
}
}