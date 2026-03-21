import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleDateFormatExampleTest {

    @Test
    public void testShowBug() {
        SimpleDateFormatExample example = new SimpleDateFormatExample();
        String result = example.showBug(); // TRIGGER BUG: SimpleDateFormatNeedsLocale
        assertEquals("Expected formatted date string", "2023-10-05 14:30:00", result); // This will fail due to locale issues
    }
}