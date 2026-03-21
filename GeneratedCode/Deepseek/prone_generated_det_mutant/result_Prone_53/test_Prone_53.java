import org.junit.Test;
import static org.junit.Assert.*;

public class ConverterTest {
    @Test
    public void testConvert() {
        Converter converter = new Converter();
        converter.convert(); // This will trigger the bug
        // TRIGGER BUG: ForOverride
        assertEquals("Converter.doForward", converter.getLastMethodCalled());
    }
}

class Base {
    protected void doForward() {
        System.out.println("Base.doForward");
    }
}

class Converter extends Base {
    @Override
    protected void doForward() {
        super.doForward(); // This is where the bug occurs
        System.out.println("Converter.doForward");
    }

    public void convert() {
        doForward();
    }

    public void showBug() {
        doForward(); // Directly invoking doForward
    }

    public String getLastMethodCalled() {
        return "Converter.doForward"; // This is a stub method to make the compiler happy
    }
}