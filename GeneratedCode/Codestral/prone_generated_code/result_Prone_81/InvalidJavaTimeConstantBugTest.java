import org.junit.Test;
import static org.junit.Assert.*;

public class InvalidJavaTimeConstantBugTest {

    @Test
    public void testShowBug() {
        InvalidJavaTimeConstantBug buggyClass = new InvalidJavaTimeConstantBug();
        // TRIGGER BUG: InvalidJavaTimeConstant
        buggyClass.showBug();
    }
}