import org.junit.Test;
import static org.junit.Assert.*;

public class SelfAssignmentBugTest {

    @Test
    public void testSetFooWithSelfAssignment() {
        SelfAssignmentBug bugDemo = new SelfAssignmentBug();
        bugDemo.showBug(10); // TRIGGER BUG: SA: Self assignment of local rather than assignment to field (SA_LOCAL_SELF_ASSIGNMENT_INSTEAD_OF_FIELD) 
        assertEquals(10, bugDemo.showBug(10)); // This assertion will fail because the field 'foo' is never updated
    }
}