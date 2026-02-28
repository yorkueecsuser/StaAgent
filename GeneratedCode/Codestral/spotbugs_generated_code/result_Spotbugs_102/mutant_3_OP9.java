import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class BadPreparedStatementAccess {
    public void showBug() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/test", "username", "password");
        PreparedStatement statement = connection.prepareStatement("INSERT INTO users(name, email) VALUES (?,?)");

        // Original bug
        statement.setString(0, "John Doe"); // should be 1
        statement.setString(0, "john@example.com"); // should be 2

        // Mutant: Introducing a do-while loop that attempts to access the prepared statement parameters with index 0
        int i = 0;
        do {
            if (i == 0) {
                statement.setString(0, "Mutant John Doe"); // still a bug
            } else if (i == 1) {
                statement.setString(0, "mutant@example.com"); // still a bug
            }
            i++;
        } while (i < 2);

        statement.executeUpdate();
    }
}