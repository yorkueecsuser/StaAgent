import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayHashCodeBugTest {

    @Test
    public void testArrayHashCodeBug() {
        ArrayHashCodeBug buggyClass = new ArrayHashCodeBug();
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        // TRIGGER BUG: ArrayHashCode
        assertNotEquals(buggyClass.showBug(array1), buggyClass.showBug(array2));
    }
}