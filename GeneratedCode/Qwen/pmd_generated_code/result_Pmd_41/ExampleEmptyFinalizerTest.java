import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleEmptyFinalizerTest {

    @Test
    public void testShowBug() {
        ExampleEmptyFinalizer example = new ExampleEmptyFinalizer();
        String result = example.showBug(); // TRIGGER BUG: EmptyFinalizer
        assertEquals("This method demonstrates the presence of an empty finalize method.", result);
    }
}