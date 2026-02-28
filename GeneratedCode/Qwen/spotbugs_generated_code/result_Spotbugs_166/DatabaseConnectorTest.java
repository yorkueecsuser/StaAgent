import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseConnectorTest {

    @Test
    public void testEmptyPasswordConnection() {
        DatabaseConnector dbConnector = new DatabaseConnector();
        try {
            // Attempting to connect to the database with an empty password
            Connection connection = dbConnector.showBug("jdbc:mysql://localhost:3306/mydb", "root"); // TRIGGER BUG: Dm: Empty database password (DMI_EMPTY_DB_PASSWORD)
            fail("Expected SQLException to be thrown due to empty password");
        } catch (SQLException e) {
            // Expected exception, do nothing
        }
    }
}