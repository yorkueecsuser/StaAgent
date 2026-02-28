import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class BadPreparedStatementAccess {
    public void showBug() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/test", "username", "password");
        PreparedStatement statement = connection.prepareStatement("INSERT INTO users(name, email) VALUES (?,?)");

        statement.setString(0, "John Doe"); // Original bugged code
        statement.setString(0, "john@example.com"); // Original bugged code

        boolean shouldRun = doesNotRun(); // Dynamically determined condition
        if (shouldRun) { // Unreachable if statement
            System.out.println("This line will never execute.");
        }

        statement.executeUpdate();
    }

    private boolean doesNotRun() { // Method that always returns false
        return false;
    }
}