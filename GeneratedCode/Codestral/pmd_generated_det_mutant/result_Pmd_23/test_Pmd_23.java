import org.junit.Test;
import static org.junit.Assert.*;

public class ClassCastExceptionWithToArrayDemoTest {
    @Test
    public void testShowBug() {
        ClassCastExceptionWithToArrayDemo demo = new ClassCastExceptionWithToArrayDemo();
        Integer[] a = demo.showBug(); // TRIGGER BUG: ClassCastExceptionWithToArray
        assertEquals(Integer.valueOf(1), a[0]);
    }
}