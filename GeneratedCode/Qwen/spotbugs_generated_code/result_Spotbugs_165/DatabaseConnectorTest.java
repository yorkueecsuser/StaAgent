import org.junit.Test;
import static org.junit.Assert.*;

public class DatabaseConnectorTest {

    @Test
    public void testShowBug() throws Exception {
        DatabaseConnector connector = new DatabaseConnector();
        connector.showBug(); // TRIGGER BUG: Dm: Hardcoded constant database password (DMI_CONSTANT_DB_PASSWORD)
    }
}