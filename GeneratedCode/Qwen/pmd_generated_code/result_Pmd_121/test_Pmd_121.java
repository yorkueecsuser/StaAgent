import org.junit.Test;
import static org.junit.Assert.*;

public class UselessStringValueOfExampleTest {

    @Test
    public void testShowBug() {
        UselessStringValueOfExample example = new UselessStringValueOfExample();
        String result = example.showBug(5); // TRIGGER BUG: UselessStringValueOf
        assertEquals("a5", result);
    }
}