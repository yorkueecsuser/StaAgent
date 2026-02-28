import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayBugTest {

    @Test
    public void testShowBug() {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        try {
            ArrayBug.showBug(arr); // TRIGGER BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
            fail("Expected an ArrayIndexOutOfBoundsException to be thrown");
        } catch (ArrayIndexOutOfBoundsException e) {
            // This is expected
        }
    }
}