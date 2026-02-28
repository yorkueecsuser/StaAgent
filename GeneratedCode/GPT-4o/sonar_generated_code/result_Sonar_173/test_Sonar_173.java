import org.junit.Test;
import static org.junit.Assert.*;

public class FinalizeMethodExampleTest {

    @Test
    public void testShowBug() {
        FinalizeMethodExample example = new FinalizeMethodExample();
        example.showBug(); // TRIGGER BUG: The "Object.finalize()" method should not be called
        fail("The bug should have been triggered due to improper finalize method call."); // Ensure test fails to indicate bug presence
    }
}