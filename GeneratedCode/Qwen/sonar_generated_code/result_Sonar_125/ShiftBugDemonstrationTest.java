import org.junit.Test;
import static org.junit.Assert.*;

public class ShiftBugDemonstrationTest {

    private ShiftBugDemonstration demo = new ShiftBugDemonstration();

    @Test
    public void testShowBug1() {
        int result = demo.showBug1(1); // TRIGGER BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
        assertEquals(1, result); // This assertion will fail because the actual result is 1, which is the expected result but the shift operation is incorrect
    }

    @Test
    public void testShowBug2() {
        int result = demo.showBug2(2); // TRIGGER BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
        assertEquals(1, result); // This assertion will fail because the actual result is 1, which is the expected result but the shift operation is incorrect
    }

    @Test
    public void testShowBug3() {
        long result = demo.showBug3(1L); // TRIGGER BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
        assertEquals(1L, result); // This assertion will fail because the actual result is 1, which is the expected result but the shift operation is incorrect
    }

    @Test
    public void testShowBug4() {
        long result = demo.showBug4(2L); // TRIGGER BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
        assertEquals(1L, result); // This assertion will fail because the actual result is 1, which is the expected result but the shift operation is incorrect
    }
}