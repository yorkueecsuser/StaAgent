import org.junit.Test;
import static org.junit.Assert.*;

public class SelfEqualsExampleTest {

    @Test
    public void testShowBug() {
        SelfEqualsExample example = new SelfEqualsExample("example");
        assertFalse(example.showBug()); // TRIGGER BUG: SelfEquals
    }
}