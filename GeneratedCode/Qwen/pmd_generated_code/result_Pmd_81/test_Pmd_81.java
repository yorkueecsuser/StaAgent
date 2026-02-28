import org.junit.Test;
import static org.junit.Assert.*;

public class UnnecessaryConversionExampleTest {

    @Test
    public void testShowBug() {
        UnnecessaryConversionExample example = new UnnecessaryConversionExample();
        String result = example.showBug(42); // TRIGGER BUG: UnnecessaryConversionTemporary
        assertEquals("42", result);
    }
}