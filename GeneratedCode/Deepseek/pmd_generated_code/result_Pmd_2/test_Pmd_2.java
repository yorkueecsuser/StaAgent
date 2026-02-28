import org.junit.Test;
import static org.junit.Assert.*;

public class StaticFieldTest {
    StaticField staticField1 = new StaticField(1);
    StaticField staticField2 = new StaticField(2);

    @Test
    public void testShowBug1() {
        assertEquals(1, staticField1.showBug()); // TRIGGER BUG: AssignmentToNonFinalStatic
    }

    @Test
    public void testShowBug2() {
        assertEquals(2, staticField2.showBug()); // TRIGGER BUG: AssignmentToNonFinalStatic
    }
}