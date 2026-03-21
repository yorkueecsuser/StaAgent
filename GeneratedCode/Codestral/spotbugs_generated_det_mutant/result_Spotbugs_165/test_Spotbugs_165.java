import org.junit.Test;
import static org.junit.Assert.assertNotEquals;

public class DatabaseConnectionTest {

    @Test
    public void testHardcodedPassword() {
        DatabaseConnection dbConnection = new DatabaseConnection();
        dbConnection.showBug(); // TRIGGER BUG: Dm: Hardcoded constant database password (DMI_CONSTANT_DB_PASSWORD)

        // The hardcoded password is "hardcodedPassword123".
        // If the database password is not this hardcoded value, the test will pass.
        // However, if the password is still hardcoded, the test will fail.
        assertNotEquals("hardcodedPassword123", "hardcodedPassword123");
    }
}