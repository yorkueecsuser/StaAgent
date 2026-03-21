import org.junit.Test;
import static org.junit.Assert.*;

public class TestInterfaceTest {
    @Test
    public void testAbstractMethod() {
        TestInterface testInterface = new TestInterface() {
            @Override
            public void abstractMethod() {
                // Method implementation
            }
        };
        testInterface.showBug(); // This line will fail
    }
}