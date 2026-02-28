import org.junit.Test;
import static org.junit.Assert.*;

public class UIStarvationExampleTest {
    @Test
    public void testShowBug() {
        UIStarvationExample example = new UIStarvationExample();
        example.showBug(); // TRIGGER BUG: STARVATION
        fail("Expected exception due to UI thread starvation");
    }
}