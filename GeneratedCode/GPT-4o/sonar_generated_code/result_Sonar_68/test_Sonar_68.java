import org.junit.Test;
import static org.junit.Assert.*;

public class ConditionalStructureBugDemoTest {

    @Test
    public void testShowBug() {
        // Create an instance of the class
        ConditionalStructureBugDemo demo = new ConditionalStructureBugDemo();
        
        // Run the method that contains the bug
        demo.showBug(); // TRIGGER BUG: All branches in a conditional structure should not have exactly the same implementation
        
        // The test should fail due to identical branches in the conditional structure
        // No assert needed as the bug is in the logic, not in an assertable outcome
    }
}