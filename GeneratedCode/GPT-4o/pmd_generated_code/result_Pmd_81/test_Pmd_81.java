import org.junit.Test;
import static org.junit.Assert.*;

public class PrimitiveConversionExampleTest {

    @Test
    public void testShowBug() {
        PrimitiveConversionExample example = new PrimitiveConversionExample();
        String expected = "123";
        String actual = example.showBug(123); // TRIGGER BUG: UnnecessaryConversionTemporary
        assertEquals(expected, actual);
    }
    
    @Test
    public void testShowBugFails() {
        PrimitiveConversionExample example = new PrimitiveConversionExample();
        String expected = "456";
        String actual = example.showBug(123); // TRIGGER BUG: UnnecessaryConversionTemporary
        assertEquals(expected, actual); // This will fail and trigger the bug
    }
}