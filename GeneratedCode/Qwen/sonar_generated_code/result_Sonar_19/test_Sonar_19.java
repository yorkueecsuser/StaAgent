import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayIndexBugTest {

    @Test
    public void testShowBugWithValidIndex() {
        ArrayIndexBug bugDemo = new ArrayIndexBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        assertEquals(3, bugDemo.showBug(sampleArray, 2));
    }

    @Test
    public void testShowBugWithInvalidIndex() {
        ArrayIndexBug bugDemo = new ArrayIndexBug();
        int[] sampleArray = {1, 2, 3, 4, 5};
        bugDemo.showBug(sampleArray, 5); // TRIGGER BUG: Accessing an array element should not trigger an ArrayIndexOutOfBoundsException
    }
}