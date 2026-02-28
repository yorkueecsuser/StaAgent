import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayIndexOutOfBoundsBugTest {
    @Test
    public void testShowBug() {
        ArrayIndexOutOfBoundsBug bug = new ArrayIndexOutOfBoundsBug();
        int[] array = {1, 2, 3, 4, 5};
        int index = 10;
        // TRIGGER BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
        bug.showBug(index, array);
    }
}