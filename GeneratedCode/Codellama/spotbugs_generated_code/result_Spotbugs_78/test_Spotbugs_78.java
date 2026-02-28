import org.junit.Test;
import static org.junit.Assert.*;

public class SelfAssignmentTest {
    @Test
    public void testShowBug() {
        SelfAssignment sa = new SelfAssignment();
        sa.showBug(10);
        // TRIGGER BUG: SA: Self assignment of local rather than assignment to field (SA_LOCAL_SELF_ASSIGNMENT_INSTEAD_OF_FIELD)
    }
}