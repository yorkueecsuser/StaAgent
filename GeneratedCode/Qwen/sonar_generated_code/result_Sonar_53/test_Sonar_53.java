import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;

public class ExceptionBugDemoTest {

    @Test(expected = IOException.class)
    public void testShowBugFThrowsException() throws IOException {
        ExceptionBugDemo demo = new ExceptionBugDemo();
        int result = demo.f(1); // This line is safe as it does not throw an exception with the given input
        // TRIGGER BUG: Only one method invocation is expected when testing checked exceptions
        demo.g(-1); // This line triggers the bug when g(-1) throws an IOException
    }

    @Test(expected = IOException.class)
    public void testShowBugGThrowsException() throws IOException {
        ExceptionBugDemo demo = new ExceptionBugDemo();
        int result = demo.f(1); // This line is safe as it does not throw an exception with the given input
        // TRIGGER BUG: Only one method invocation is expected when testing checked exceptions
        demo.g(15); // This line triggers the bug when g(15) throws an IOException
    }
}