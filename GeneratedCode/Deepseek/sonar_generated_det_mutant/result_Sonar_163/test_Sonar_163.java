import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void triggerBug() {
        Main m = new Main();
        m.showBug(); // TRIGGER BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
    }
}