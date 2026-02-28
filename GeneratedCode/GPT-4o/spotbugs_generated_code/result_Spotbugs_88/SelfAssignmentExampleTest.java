import org.junit.Test;
import static org.junit.Assert.*;

public class SelfAssignmentExampleTest {

    @Test
    public void testShowBug() {
        SelfAssignmentExample example = new SelfAssignmentExample(10);
        int result = example.showBug(); // TRIGGER BUG: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
        assertNotEquals("The self-assignment should not affect the value of x", 10, result); // This will fail
    }
}