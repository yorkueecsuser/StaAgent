import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class BadPreparedStatementAccess {
    public void showBug() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/test", "username", "password");
        PreparedStatement statement = connection.prepareStatement("INSERT INTO users(name, email) VALUES (?,?)");

        // Unreachable for loop mutant
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because the condition is always false
            // This code will not be executed
            System.out.println("This is an unreachable loop");
        }

        // BUG: SQL: Method attempts to access a prepared statement parameter with index 0 (SQL_BAD_PREPARED_STATEMENT_ACCESS)
        statement.setString(0, "John Doe"); // should be 1
        statement.setString(0, "john@example.com"); // should be 2

        statement.executeUpdate();
    }

    private boolean getCondition() {
        // This method returns false to make the for loop unreachable
        return false;
    }
}