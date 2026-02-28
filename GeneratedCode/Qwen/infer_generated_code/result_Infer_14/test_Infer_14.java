import org.junit.Test;
import static org.junit.Assert.*;

public class UiThreadStarvationExampleTest {

    @Test
    public void testShowBug() {
        UiThreadStarvationExample example = new UiThreadStarvationExample();
        String result = example.showBug(); // TRIGGER BUG: STARVATION
        assertEquals("Operation Complete", result);
    }
}