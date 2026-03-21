import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    // TRIGGER BUG: MF: Class defines field that masks a superclass field (MF_CLASS_MASKS_FIELD)
    public void testShowBug() {
        Main main = new Main();
        assertEquals(16, main.showBug()); // This line will fail because the showBug method is expecting 16 but it will return 26 because it is adding the list elements to the original `number`
    }
}