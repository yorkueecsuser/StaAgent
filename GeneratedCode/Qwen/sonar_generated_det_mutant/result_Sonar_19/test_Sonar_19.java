import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayIndexBugTest {

    @Test
    public void testShowBugWithOutBoundsIndex() {
        ArrayIndexBug bugDemo = new ArrayIndexBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        bugDemo.showBug(sampleArray, 5); // TRIGGER BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
    }
}