import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class BadPreparedStatementAccess {
    public void showBug() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/test", "username", "password");
        PreparedStatement statement = connection.prepareStatement("INSERT INTO users(name, email) VALUES (?,?)");

        boolean unreachable = false;

        statement.setString(0, "John Doe"); // Original bug
        while (unreachable) {
            statement.setString(1, "John Doe"); // Mutant code: Unreachable while loop
        }

        statement.setString(0, "john@example.com"); // Original bug
        while (unreachable) {
            statement.setString(2, "john@example.com"); // Mutant code: Unreachable while loop
        }

        statement.executeUpdate();
    }
}