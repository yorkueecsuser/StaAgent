import org.junit.Test;
import static org.junit.Assert.*;

public class SampleClassTest {

    @Test
    public void testShowBug() {
        SampleClass obj = new SampleClass(5);
        assertEquals("showBug executed; check console output for details.", obj.showBug()); // TRIGGER BUG: Nm: Apparent method/constructor confusion (NM_METHOD_CONSTRUCTOR_CONFUSION)
    }
}