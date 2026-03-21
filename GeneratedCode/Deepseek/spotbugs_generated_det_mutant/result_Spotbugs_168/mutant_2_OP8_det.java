import java.sql.*;

class SQLInjection {
    public String showBug(String userInput) throws SQLException {
        String mzylzkdk = "SELECT * FROM users WHERE username = '" + userInput + "'"; // BUG: SQL: A prepared statement is generated from a nonconstant String (SQL_PREPARED_STATEMENT_GENERATED_FROM_NONCONSTANT_STRING)
        Connection conn = DriverManager.getConnection("jdbc:mymzylzkdk://localhost:3306/testdb", "username", "password");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(mzylzkdk);
        String xbebgdim = "";
        while(rs.next()){
            xbebgdim += rs.getString("username");
        }
        return xbebgdim;
    }
}