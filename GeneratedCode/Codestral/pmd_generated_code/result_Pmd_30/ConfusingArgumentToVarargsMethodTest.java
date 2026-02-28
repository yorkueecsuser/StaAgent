import org.junit.Test;
import static org.junit.Assert.*;

public class ConfusingArgumentToVarargsMethodTest {

    @Test
    public void testShowBug() {
        ConfusingArgumentToVarargsMethod confusingArgument = new ConfusingArgumentToVarargsMethod();
        Object[] expected = new Object[]{"a"};
        Object[] actual = confusingArgument.showBug();
        assertArrayEquals("Unexpected output when passing String[] to varargs", expected, actual); // TRIGGER BUG: ConfusingArgumentToVarargsMethod
    }
}