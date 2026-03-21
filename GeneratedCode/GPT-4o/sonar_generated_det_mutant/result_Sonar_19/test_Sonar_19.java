import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayIndexOutOfBoundsExampleTest {

    @Test
    public void testShowBug() {
        ArrayIndexOutOfBoundsExample example = new ArrayIndexOutOfBoundsExample();
        int[] numbers = {10, 20, 30, 40, 50};

        // This should trigger the bug by attempting to access an out-of-bounds index
        example.showBug(numbers, 5); // TRIGGER BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
    }
}