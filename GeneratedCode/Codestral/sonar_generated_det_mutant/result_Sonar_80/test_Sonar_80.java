import org.junit.Test;
import static org.junit.Assert.*;

public class VolatileBugTest {
    @Test
    public void testBugTrigger() throws InterruptedException {
        VolatileBug bug = new VolatileBug();
        int[] initialArray = bug.showBugArray();

        // Modify array in a separate thread
        Thread thread1 = new Thread(() -> {
            bug.updateValues(0, 10, new VolatileBug.MyObj());
        });
        thread1.start();
        thread1.join();

        int[] modifiedArray = bug.showBugArray();
        assertNotEquals(initialArray[0], modifiedArray[0]); // TRIGGER BUG: Non-primitive fields should not be "volatile"

        VolatileBug.MyObj initialObject = bug.showBugObject();
        initialObject.setValue(20);

        // Modify object in a separate thread
        Thread thread2 = new Thread(() -> {
            VolatileBug.MyObj newObject = new VolatileBug.MyObj();
            newObject.setValue(30);
            bug.updateValues(0, 0, newObject);
        });
        thread2.start();
        thread2.join();

        VolatileBug.MyObj modifiedObject = bug.showBugObject();
        assertNotEquals(initialObject.getValue(), modifiedObject.getValue()); // TRIGGER BUG: Non-primitive fields should not be "volatile"
    }
}