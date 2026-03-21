import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testShowBug() {
        Main.showBug(); // TRIGGER BUG: Equals method should be overridden in records containing array fields
    }
}