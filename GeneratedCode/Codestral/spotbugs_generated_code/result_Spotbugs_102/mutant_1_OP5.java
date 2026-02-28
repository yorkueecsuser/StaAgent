import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class BadPreparedStatementAccess {
    public void showBug() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/test", "username", "password");
        PreparedStatement statement = connection.prepareStatement("INSERT INTO users(name, email) VALUES (?,?)");

        // BUG: SQL: Method attempts to access a prepared statement parameter with index 0
        statement.setString(0, "John Doe"); // should be 1
        statement.setString(0, "john@example.com"); // should be 2

        // ADDITIONAL CODE: Unreachable switch statement
        boolean shouldRun = false;
        if (shouldRun) {
            int value = 0; // This should always evaluate to a value that is not used in the switch statement
            switch(value) {
                case 1:
                    System.out.println("This line should be unreachable");
                    break;
            }
        }

        statement.executeUpdate();
    }
}