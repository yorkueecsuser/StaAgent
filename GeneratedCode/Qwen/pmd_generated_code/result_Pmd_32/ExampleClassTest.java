import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class ExampleClassTest {

    @Test
    public void testShowBug() {
        ExampleClass example = new ExampleClass();
        List<String> results = example.showBug(); // TRIGGER BUG: DetachedTestCase
        assertEquals("Detached test case executed", results.get(0));
    }
}