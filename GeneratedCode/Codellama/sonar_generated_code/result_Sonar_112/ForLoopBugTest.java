import org.junit.Test;
import static org.junit.Assert.*;

class ForLoopBugTest {
    @Test
    public void testForLoopBug() {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i--) {
            System.out.println(arr[i]);
        }
    }
}