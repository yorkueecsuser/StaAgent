import org.junit.Test;
import static org.junit.Assert.*;

public class ClassCastExceptionWithToArrayTest {
    @Test
    public void testShowBug() {
        Integer[] array = ClassCastExceptionWithToArray.showBug();
        // TRIGGER BUG: ClassCastExceptionWithToArray
        assertEquals(null, array[0]);
    }
}