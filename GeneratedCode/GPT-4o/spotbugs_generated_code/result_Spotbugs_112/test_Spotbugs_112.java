import org.junit.Test;
import static org.junit.Assert.*;

public class VariableMaskingExampleTest {

    @Test
    public void testShowBug() {
        VariableMaskingExample example = new VariableMaskingExample();
        int result = example.showBug(5); // TRIGGER BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
        assertEquals(10, result); // Expecting the field value 10, but will get 5 due to the bug
    }
}