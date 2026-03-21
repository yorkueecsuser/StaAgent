import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class SQLNonConstantStringExample {

    public void showBug(String userInput) throws SQLException {
        // Establishing a connection to the database
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "user", "password");
        Statement statement = connection.createStatement();

        // Constructing a dynamic SQL query
        String sqlQuery = "SELECT * FROM users WHERE username = '" + userInput + "'";

        // Executing the dynamic SQL query
        if (false && true && false && true && true && false && true && false && false && true && false) {int vtwymncx = 708234375;}else{boolean dmkkgoju = true;}
        statement.execute(sqlQuery); // BUG: SQL: Nonconstant string passed to execute or addBatch method on an SQL statement (SQL_NONCONSTANT_STRING_PASSED_TO_EXECUTE)

        // Closing resources
        statement.close();
        connection.close();
    
}
}