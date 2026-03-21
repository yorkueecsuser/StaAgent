import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class BadPreparedStatementAccess {
    public void showBug() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/test", "username", "password");
        PreparedStatement statement = connection.prepareStatement("INSERT INTO users(name, email) VALUES (?,?)");

        // BUG: SQL: Method attempts to access a prepared statement parameter with index 0 (SQL_BAD_PREPARED_STATEMENT_ACCESS)
        statement.setString(0, "John Doe"); // should be 1
        statement.setString(0, "john@example.com"); // should be 2

        // Mutated code: Unreachable for loop
        boolean unreachableCondition = false;
        for (int i = 0; unreachableCondition; i++) {
            // This loop is unreachable since the 'unreachableCondition' is always false.
            // Adding some unreachable code for demonstration purposes
            System.out.println("This line will never get executed.");
        }

        statement.executeUpdate();
    }

    // Method to simulate dynamic condition determination for the loop
    private boolean getCondition() {
        // Add your dynamic condition here
        return Math.random() < 0.5;
    }
}