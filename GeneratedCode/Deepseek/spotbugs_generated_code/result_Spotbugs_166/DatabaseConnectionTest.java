import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.SQLException;

public class DatabaseConnectionTest {

    @Test
    public void testShowBug() throws SQLException {
        DatabaseConnection connection = new DatabaseConnection();
        // TRIGGER BUG: Dm: Empty database password (DMI_EMPTY_DB_PASSWORD)
        connection.showBug();
    }
}