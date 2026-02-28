import org.junit.Test;
import static org.junit.Assert.*;

public class RedundantSetterCallExampleTest {

    @Test
    public void testRedundantSetterCall() {
        RedundantSetterCallExample example = new RedundantSetterCallExample();
        RedundantSetterCallExample.Copy copy = example.new Copy("value1", "value2");
        assertEquals("value1", example.showBug(copy)); // TRIGGER BUG: RedundantSetterCall
    }
}