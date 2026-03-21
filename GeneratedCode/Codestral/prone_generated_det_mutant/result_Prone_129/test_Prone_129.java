import org.junit.Test;
import static org.junit.Assert.*;

public class BadPackageInfoExampleTest {

    @Test
    public void testShowBug() {
        try {
            Class.forName("com.example.BadPackageInfoExample"); // TRIGGER BUG: PackageInfo
            fail("Expected ClassNotFoundException to be thrown");
        } catch (ClassNotFoundException e) {
            // Expected exception, do nothing
        }
    }
}