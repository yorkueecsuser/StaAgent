import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class BadPreparedStatementAccess {
    // Method to simulate dynamic condition
    private boolean getFalseCondition() {
        return false;
    }

    public void showBug() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/test", "username", "password");
        PreparedStatement statement = connection.prepareStatement("INSERT INTO users(name, email) VALUES (?,?)");

        // BUG: SQL: Method attempts to access a prepared statement parameter with index 0 (SQL_BAD_PREPARED_STATEMENT_ACCESS)
        statement.setString(0, "John Doe"); // should be 1

        // Unreachable if-else statement
        if (getFalseCondition()) {
            // This block will never execute
            statement.setString(0, "Unreachable Name");
        } else {
            // This else block is also unreachable
            statement.setString(0, "Another Unreachable Name");
        }

        statement.setString(0, "john@example.com"); // should be 2

        statement.executeUpdate();
    }
}