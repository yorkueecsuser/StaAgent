import org.junit.Test;
import static org.junit.Assert.*;

public class CTest {

    @Test
    public void testShowBug() {
        C instance = new C() {
            @Override
            void varargs(Object... args) {
                assertEquals(1, args.length); // Expecting one element, but due to the bug, it might not be the case
                assertTrue(args[0] instanceof String[]); // Expecting a String[], but due to the bug, it might be an Object[]
            }
        };

        instance.showBug(new String[]{"a"}); // TRIGGER BUG: ConfusingArgumentToVarargsMethod
    }

    @Test
    public void testShowBug2() {
        C instance = new C() {
            @Override
            void varargs(Object... args) {
                assertEquals(0, args.length); // Expecting zero elements, but due to the bug, it might not be the case
            }
        };

        instance.showBug2(); // TRIGGER BUG: ConfusingArgumentToVarargsMethod
    }
}