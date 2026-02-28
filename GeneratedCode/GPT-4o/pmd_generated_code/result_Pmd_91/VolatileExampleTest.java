import org.junit.Test;
import static org.junit.Assert.*;

public class VolatileExampleTest {

    @Test
    public void testShowBug() {
        VolatileExample example = new VolatileExample();
        int result = example.showBug(); // TRIGGER BUG: AvoidUsingVolatile
        
        // The expected result should be 0, but the incorrect use of volatile may lead to 
        // unexpected behavior. Therefore, to trigger the bug, assert that the result is not 0.
        assertNotEquals("The volatile keyword is used incorrectly, leading to unexpected results.", 0, result); // TRIGGER BUG: AvoidUsingVolatile
    }
}