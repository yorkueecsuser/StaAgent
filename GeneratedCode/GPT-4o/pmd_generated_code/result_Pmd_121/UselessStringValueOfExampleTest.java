import org.junit.Test;
import static org.junit.Assert.*;

public class UselessStringValueOfExampleTest {

    @Test
    public void testShowBug() {
        UselessStringValueOfExample example = new UselessStringValueOfExample();
        String result = example.showBug(42); // TRIGGER BUG: UselessStringValueOf
        assertEquals("Number: 42", result); // TRIGGER BUG: UselessStringValueOf
    }
}