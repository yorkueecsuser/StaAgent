import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testAssertValues() {
        Main main = new Main();
        // TRIGGER BUG: Assertions comparing incompatible types should not be made
        main.showBug(); 
    }
}