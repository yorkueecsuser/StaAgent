import org.junit.Test;
import static org.junit.Assert.*;

public class FinalizeExampleTest {

    @Test
    public void testFinalizeWithoutCallingSuper() {
        FinalizeExample example = new FinalizeExample();
        example.showBug(); // TRIGGER BUG: FinalizeDoesNotCallSuperFinalize
    }
}