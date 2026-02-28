import org.junit.Test;
import static org.junit.Assert.*;

public class NullFieldExampleTest {

    @Test
    public void testShowBug() {
        NullFieldExample example = new NullFieldExample();
        String result = example.showBug(); // TRIGGER BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)
        assertNotNull("The field 'alwaysNull' should not be null", result);
    }
}