import org.junit.Test;
import static org.junit.Assert.*;
import java.sql.Connection;

public class DatabaseConnectorTest {

    @Test
    public void testConnectionWithHardcodedPassword() {
        DatabaseConnector connector = new DatabaseConnector();
        Connection connection = connector.showBug(); // TRIGGER BUG: Dm: Hardcoded constant database password (DMI_CONSTANT_DB_PASSWORD)
        assertNotNull("Connection should not be null with hardcoded password.", connection);
    }
}