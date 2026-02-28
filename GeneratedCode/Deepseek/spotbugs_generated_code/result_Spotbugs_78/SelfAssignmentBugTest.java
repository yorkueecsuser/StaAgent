import org.junit.Test;
import static org.junit.Assert.*;

public class SelfAssignmentBugTest {

    @Test
    public void testSelfAssignmentBug() {
        SelfAssignmentBug selfAssignmentBug = new SelfAssignmentBug();
        int testData = 10;
        int result = selfAssignmentBug.showBug(testData); // TRIGGER BUG: SA: Self assignment of local rather than assignment to field (SA_LOCAL_SELF_ASSIGNMENT_INSTEAD_OF_FIELD)
        assertNotEquals(testData, result); // The test should fail because the result should be equal to testData
    }
}