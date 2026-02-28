import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testShowBug() {
        Main main = new Main();
        main.showBug(42);
        // TRIGGER BUG: Members ignored during record serialization should not be used
        fail("The bug should have been triggered, but it wasn't"); // This line will never be reached because the previous line will throw an exception
    }
}