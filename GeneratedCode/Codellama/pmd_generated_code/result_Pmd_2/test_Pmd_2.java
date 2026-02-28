import org.junit.Test;
import static org.junit.Assert.*;

class AssignmentToNonFinalStaticTest {
    @Test
    public void testBug() {
        AssignmentToNonFinalStatic assignmentToNonFinalStatic = new AssignmentToNonFinalStatic();
        assignmentToNonFinalStatic.main(new String[0]);
        // TRIGGER BUG: AssignmentToNonFinalStatic
        assertEquals(0, assignmentToNonFinalStatic.showBug());
    }
}