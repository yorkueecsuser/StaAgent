import org.junit.Test;
import static org.junit.Assert.*;

public class ConfusionExampleTest {

    @Test
    public void testShowBug() {
        ConfusionExample example = new ConfusionExample("Test Message");
        assertEquals("Check the console for the bug demonstration.", example.showBug()); // TRIGGER BUG: Nm: Apparent method/constructor confusion (NM_METHOD_CONSTRUCTOR_CONFUSION)
    }
}