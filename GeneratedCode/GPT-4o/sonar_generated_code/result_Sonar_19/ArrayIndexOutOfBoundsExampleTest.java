import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayIndexOutOfBoundsExampleTest {

    @Test
    public void testShowBug() {
        ArrayIndexOutOfBoundsExample example = new ArrayIndexOutOfBoundsExample();
        int[] sampleArray = {1, 2, 3, 4, 5};

        // This test will fail and trigger the bug by attempting to access an out-of-bounds index
        example.showBug(sampleArray, 5); // TRIGGER BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
    }
}