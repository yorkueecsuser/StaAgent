import org.junit.Test;
import static org.junit.Assert.*;
import java.util.concurrent.Future;

public class AsyncFunctionReturnsNullTest {
    @Test
    public void testShowBug() {
        AsyncFunctionReturnsNull asyncFunctionReturnsNull = new AsyncFunctionReturnsNull();
        Future<String> future = asyncFunctionReturnsNull.showBug("input");
        // TRIGGER BUG: AsyncFunctionReturnsNull
        assertNotNull(future);
    }
}