import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class MethodCallExceptionDemoTest {

    @Test
    public void testShowBugWithOutOfBoundsIndex() {
        MethodCallExceptionDemo demo = new MethodCallExceptionDemo();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // This will trigger the bug as it calls showBug with an out-of-bounds index.
        demo.showBug(numbers, 5); // TRIGGER BUG: Calls to methods should not trigger an exception
    }

    @Test
    public void testShowBugWithNegativeIndex() {
        MethodCallExceptionDemo demo = new MethodCallExceptionDemo();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // This will trigger the bug as it calls showBug with a negative index.
        demo.showBug(numbers, -1); // TRIGGER BUG: Calls to methods should not trigger an exception
    }
}