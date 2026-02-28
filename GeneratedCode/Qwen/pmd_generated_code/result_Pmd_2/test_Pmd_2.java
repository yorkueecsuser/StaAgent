import org.junit.Test;
import static org.junit.Assert.*;

public class StaticFieldExampleTest {

    @Test
    public void testShowBug() {
        StaticFieldExample example1 = new StaticFieldExample(10); // TRIGGER BUG: AssignmentToNonFinalStatic
        assertEquals(10, example1.showBug(10)); // TRIGGER BUG: AssignmentToNonFinalStatic

        StaticFieldExample example2 = new StaticFieldExample(20); // TRIGGER BUG: AssignmentToNonFinalStatic
        assertEquals(20, example2.showBug(20)); // TRIGGER BUG: AssignmentToNonFinalStatic

        // At this point, sharedValue should be 20 due to the last assignment in example2.showBug(20)
        assertEquals(10, example1.showBug(10)); // This will fail because sharedValue is now 20, not 10
    }
}