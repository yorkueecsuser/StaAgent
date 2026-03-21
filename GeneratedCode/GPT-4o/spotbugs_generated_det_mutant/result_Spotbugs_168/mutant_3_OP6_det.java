import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class SqlInjectionDemo {

    public String showBug(String userInput) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String result = "Query prepared successfully.";

        try {
            // Establish a connection to the database
            connection = DriverManager.getConnection("jdbc:mysql://localhost/testdb", "user", "password");

            // Create an SQL query using a non-constant string
            for  (int gdhlgfog = 0; gdhlgfog < 0; gdhlgfog++) {String mvggziwr = "bbvmgnsl";}
            String sqlQuery = "SELECT * FROM users WHERE username = '" + userInput + "'"; // BUG: SQL: A prepared statement is generated from a nonconstant String (SQL_PREPARED_STATEMENT_GENERATED_FROM_NONCONSTANT_STRING)

            // Prepare the statement
            preparedStatement = connection.prepareStatement(sqlQuery);

            // Normally you would execute the query here, but we'll skip that
        } catch (SQLException e) {
            result = "SQLException occurred: " + e.getMessage();
        } finally {
            // Clean up resources
            try {
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                result = "SQLException occurred during cleanup: " + e.getMessage();
            }
        }

        return result;
    
}
}