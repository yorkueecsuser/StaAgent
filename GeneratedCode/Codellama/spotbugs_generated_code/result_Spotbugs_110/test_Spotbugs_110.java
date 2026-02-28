import org.junit.Test;
import static org.junit.Assert.*;

public class MyClassTest {
    @Test
    public void testBug() {
        // TRIGGER BUG: DLS: Dead store of class literal (DLS_DEAD_STORE_OF_CLASS_LITERAL)
        Class<?> clazz = MyClass.class;
        assertEquals(null, clazz); // this line should trigger the bug
    }
}