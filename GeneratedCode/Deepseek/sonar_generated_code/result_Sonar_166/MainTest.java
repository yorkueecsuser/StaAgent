import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    Main main = new Main();

    // TRIGGER BUG: Methods should not be named "tostring", "hashcode" or "equal"
    @Test
    public void testTostring() {
        main.showBug();
    }

    // TRIGGER BUG: Methods should not be named "tostring", "hashcode" or "equal"
    @Test
    public void testHashcode() {
        main.showBug();
    }

    // TRIGGER BUG: Methods should not be named "tostring", "hashcode" or "equal"
    @Test
    public void testEqual() {
        main.showBug();
    }
}