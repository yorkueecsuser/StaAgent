import org.junit.Test;
import static org.junit.Assert.*;

public class OptionalAccessExampleTest {

    @Test
    public void testShowBug() {
        OptionalAccessExample example = new OptionalAccessExample();
        example.showBug(); // TRIGGER BUG: Optional value should only be accessed after calling isPresent()
    }

    @Test
    public void testShowBug2() {
        OptionalAccessExample example = new OptionalAccessExample();
        example.showBug2(); // TRIGGER BUG: Optional value should only be accessed after calling isPresent()
    }
}