import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;

public class Bug1Test {
    Bug1 bug1 = new Bug1();

    @Test
    public void testBug() {
        try {
            bug1.showBug1();
            fail("Expected an IOException to be thrown"); // Trigger line: 12
        } catch (IOException e) {
            // Expected
        }
    }
}