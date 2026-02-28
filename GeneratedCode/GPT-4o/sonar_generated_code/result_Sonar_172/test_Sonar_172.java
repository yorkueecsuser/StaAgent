import org.junit.Test;
import static org.junit.Assert.*;

public class FinalizeExampleTest {

    @Test
    public void testShowBug() {
        FinalizeExample example = new FinalizeExample();
        example.showBug(); // TRIGGER BUG: "super.finalize()" should be called at the end of "Object.finalize()" implementations
        
        // Fail the test to trigger the bug
        fail("The finalize method should call super.finalize() at the end."); // TRIGGER BUG: "super.finalize()" should be called at the end of "Object.finalize()" implementations
    }
}