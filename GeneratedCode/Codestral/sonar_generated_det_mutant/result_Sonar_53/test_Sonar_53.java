import static org.junit.Assert.*;
import org.junit.Test;
import java.io.IOException;

public class BuggyCodeTest {
    BuggyCode buggyCode = new BuggyCode();

    @Test(expected = IOException.class)
    public void testShowBug() throws IOException {
        // TRIGGER BUG: Only one method invocation is expected when testing checked exceptions
        buggyCode.showBug(1); // Noncompliant: both f() and g() can throw IOException, making it unclear which one is being tested
    }
}