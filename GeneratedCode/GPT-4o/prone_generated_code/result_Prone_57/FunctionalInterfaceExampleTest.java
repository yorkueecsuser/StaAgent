import org.junit.Test;
import static org.junit.Assert.*;

public class FunctionalInterfaceExampleTest {

    @Test
    public void testShowBug() {
        FunctionalInterfaceExample example = new FunctionalInterfaceExample();
        String result = example.showBug(); // TRIGGER BUG: FunctionalInterfaceMethodChanged
        assertEquals("Hello from qux!", result); // This assertion is designed to fail due to the bug
    }
}