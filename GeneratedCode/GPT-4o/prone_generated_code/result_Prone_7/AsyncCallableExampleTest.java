import org.junit.Test;
import static org.junit.Assert.*;

public class AsyncCallableExampleTest {

    @Test
    public void testShowBug() {
        AsyncCallableExample example = new AsyncCallableExample();
        example.showBug(); // TRIGGER BUG: AsyncCallableReturnsNull
    }
}