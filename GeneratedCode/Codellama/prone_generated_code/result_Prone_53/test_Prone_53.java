import org.junit.Test;
import static org.junit.Assert.*;

public class ConverterTest {
    @Test
    public void testConvert() {
        Converter converter = new Converter();
        Object obj = new Object();
        // TRIGGER BUG: ForOverride
        String converted = converter.convert(obj);
        assertEquals("Expected string value", converted);
    }

    @Test
    public void testDoForward() {
        Converter converter = new Converter();
        Object obj = new Object();
        // TRIGGER BUG: ForOverride
        String forwarded = converter.doForward(obj);
        assertEquals("Expected string value", forwarded);
    }
}