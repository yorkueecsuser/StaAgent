import org.junit.Test;
import static org.junit.Assert.*;

public class UnwrittenFieldExampleTest {

    @Test
    public void testUnwrittenFieldDefaultValue() {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        assertEquals(0, example.showBug()); // TRIGGER BUG: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)
    }
}