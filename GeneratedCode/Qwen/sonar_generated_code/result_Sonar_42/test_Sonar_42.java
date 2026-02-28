import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleClassTest {

    @Test
    public void testShowBug() {
        ExampleClass example = new ExampleClass(5);
        example.showBug(); // TRIGGER BUG: Assertions should not compare an object to itself
    }
}