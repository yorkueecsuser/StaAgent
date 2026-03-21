import org.junit.Test;
import static org.junit.Assert.*;

public class AssertJConsumerExampleTest {
    
    @Test
    public void testShowBug1() {
        AssertJConsumerExample example = new AssertJConsumerExample();
        String result = example.showBug1("Hello"); // TRIGGER BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
        assertEquals("Hello", result);
    }
    
    @Test
    public void testShowBug2() {
        AssertJConsumerExample example = new AssertJConsumerExample();
        boolean result = example.showBug2("Hello"); // TRIGGER BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
        assertTrue(result);
    }
}