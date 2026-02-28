import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testShowBug() {
        String actualResult = Main.showBug();
        String expectedResult = "Contains itself: " + true;
        assertEquals(expectedResult, actualResult); // TRIGGER BUG: String operations with predictable outcomes should be avoided
    }
}