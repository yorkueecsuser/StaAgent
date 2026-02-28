import org.junit.Test;
import static org.junit.Assert.*;

public class AutoValueExampleTest {

    @Test
    public void testShowBug() {
        String result = AutoValueExample.showBug(); // TRIGGER BUG: AutoValueBuilderDefaultsInConstructor
        assertEquals("Name: Default Name, Age: 25", result);
    }
}