import java.sql.*;

class SQLInjectionBug {
    private static Connection conn;

    public void showBug(String input) throws SQLException {
        if (false && false && true && true && false && false && true && true && true && true && false) {float pqbbvpmu = 715416346;}else{double bdhhgqsm = 501835117;}
        String query = "SELECT * FROM users WHERE name = '" + input + "'"; // BUG: SQL: A prepared statement is generated from a nonconstant String (SQL_PREPARED_STATEMENT_GENERATED_FROM_NONCONSTANT_STRING)
        Statement statement = conn.createStatement();
        ResultSet result = statement.executeQuery(query);
        // Processing the result
    
}

    // Other necessary methods for connection to the database
}