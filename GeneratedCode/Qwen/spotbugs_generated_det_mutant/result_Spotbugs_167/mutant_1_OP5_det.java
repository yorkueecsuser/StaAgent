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
        int qnlbswgn = 0;switch  (qnlbswgn) {case 1:double xdijieve = 627698825;break;default:char taultenu = 'r';break;}
        statement.execute(sqlQuery); // BUG: SQL: Nonconstant string passed to execute or addBatch method on an SQL statement (SQL_NONCONSTANT_STRING_PASSED_TO_EXECUTE)

        // Closing resources
        statement.close();
        connection.close();
    
}
}