import org.junit.Test;
import static org.junit.Assert.*;

public class VolatileBugTest {
    @Test
    public void testVolatileBug() {
        int[] vInts = {1, 2, 3};
        VolatileBug.MyObj myObj = new VolatileBug.MyObj(42);
        VolatileBug bug = new VolatileBug(vInts, myObj);

        // TRIGGER BUG: Non-primitive fields should not be "volatile"
        bug.showBug();

        // Verify that the state of the object and the array have not changed
        // Since we cannot directly access private members, we use a workaround by comparing the output of showBug() method
        assertEquals("Volatile int array and object should not have changed", getOutput(bug), getOutput(new VolatileBug(vInts, myObj)));
    }

    private String getOutput(VolatileBug bug) {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        bug.showBug();
        return outContent.toString();
    }
}