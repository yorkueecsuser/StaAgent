import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    // TRIGGER BUG: ArrayFillIncompatibleType
    public void testShowBug() {
        // Given
        Main main = new Main();

        // When
        try {
            main.showBug();
            fail("Expected an ArrayStoreException to be thrown");
        } catch (ArrayStoreException e) {
            // Expected exception
        }
    }
}