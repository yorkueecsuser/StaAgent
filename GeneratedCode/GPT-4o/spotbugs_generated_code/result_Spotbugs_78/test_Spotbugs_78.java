import org.junit.Test;
import static org.junit.Assert.*;

public class SelfAssignmentBugExampleTest {

    @Test
    public void testShowBug() {
        SelfAssignmentBugExample example = new SelfAssignmentBugExample();
        int result = example.showBug(10); // TRIGGER BUG: SA: Self assignment of local rather than assignment to field (SA_LOCAL_SELF_ASSIGNMENT_INSTEAD_OF_FIELD)
        assertEquals("The value of foo should be 10", 10, result); // TRIGGER BUG: SA: Self assignment of local rather than assignment to field (SA_LOCAL_SELF_ASSIGNMENT_INSTEAD_OF_FIELD)
    }
}