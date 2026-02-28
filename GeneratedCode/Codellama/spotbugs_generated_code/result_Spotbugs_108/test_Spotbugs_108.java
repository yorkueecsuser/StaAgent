import org.junit.Test;
import static org.junit.Assert.*;

class STIExampleTest {
    @Test
    public void testSTI() {
        STIExample example = new STIExample();
        example.showBug();
        // TRIGGER BUG: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD)
        assertTrue(example.isInterrupted());
    }
}