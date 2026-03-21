import org.junit.Test;
import static org.junit.Assert.*;

public class AsyncFunctionDemoTest {

    @Test
    public void testShowBugWithNullInput() {
        AsyncFunctionDemo demo = new AsyncFunctionDemo();
        demo.showBug(null); // TRIGGER BUG: AsyncFunctionReturnsNull
    }
}