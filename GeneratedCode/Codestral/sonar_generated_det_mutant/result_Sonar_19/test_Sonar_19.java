import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayIndexOutOfBoundsBugTest {

    @Test
    public void testShowBug() {
        ArrayIndexOutOfBoundsBug bugDemo = new ArrayIndexOutOfBoundsBug();
        int[] arr = {1, 2, 3, 4, 5};
        bugDemo.showBug(arr, 10); // TRIGGER BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
    }
}