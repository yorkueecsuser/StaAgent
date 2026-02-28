import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Field;

public class MainTest {
    @Test
    public void testShowBug() {
        try {
            Main.showBug();
            fail("Expected an IllegalAccessException to be thrown"); // TRIGGER BUG: Reflection should not be used to increase accessibility of records' fields
        } catch (Exception ignored) {
        }
    }
}