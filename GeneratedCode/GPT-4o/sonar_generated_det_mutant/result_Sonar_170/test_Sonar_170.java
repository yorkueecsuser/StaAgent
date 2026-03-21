import org.junit.Test;
import static org.junit.Assert.*;

public class FinalizeExampleTest {

    @Test
    public void testShowBug() {
        FinalizeExample example = new FinalizeExample();
        int result = example.showBug(5); // TRIGGER BUG: The signature of "finalize()" should match that of "Object.finalize()"
        assertEquals(10, result); // Expecting 10 but should fail due to bug
    }
    
    @Test
    public void testShowBugWithDifferentInput() {
        FinalizeExample example = new FinalizeExample();
        int result = example.showBug(10); // TRIGGER BUG: The signature of "finalize()" should match that of "Object.finalize()"
        assertEquals(20, result); // Expecting 20 but should fail due to bug
    }
}