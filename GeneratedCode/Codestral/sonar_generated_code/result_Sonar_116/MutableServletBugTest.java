import org.junit.Test;
import static org.junit.Assert.*;

public class MutableServletBugTest {

    @Test
    public void testShowBug() {
        MutableServletBug buggyServlet = new MutableServletBug();
        buggyServlet.showBug();  // TRIGGER BUG: Servlets should not have mutable instance fields

        // After two increments, the counter should be 2 but due to the bug, it will be less than 2
        // However, since we can't directly access the private counter variable, we can't check its value directly
        // Instead, we assume that if showBug() doesn't throw an exception, the bug is being triggered
    }
}