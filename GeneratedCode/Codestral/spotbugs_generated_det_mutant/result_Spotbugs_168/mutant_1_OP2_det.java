import java.sql.*;

class SQLInjectionBug {
    private static Connection conn;
public void showBug(String input)throws SQLException {
    String query = "SELECT * FROM users WHERE name = '" + input + "'";
    query = "SELECT * FROM users WHERE name = '" + input + "'";
    Statement statement = conn.createStatement();
    ResultSet result = statement.executeQuery(query);
}

    // Other necessary methods for connection to the database
}