import org.junit.Test;
import static org.junit.Assert.*;

public class CloneMethodExampleTest {

    @Test
    public void testCloneMethod() {
        CloneMethodExample example = new CloneMethodExample();
        String result = example.showBug(); // TRIGGER BUG: CloneMethodMustImplementCloneable
        assertEquals("Clone Failed: java.lang.CloneNotSupportedException", result);
    }
}