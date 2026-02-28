import org.junit.Test;
import static org.junit.Assert.*;

public class NullDereferenceExampleTest {

    @Test
    public void testShowBugWithException() {
        NullDereferenceExample example = new NullDereferenceExample();
        example.showBug("throw"); // TRIGGER BUG: NP: Value is null and guaranteed to be dereferenced on exception path (NP_GUARANTEED_DEREF_ON_EXCEPTION_PATH) 
    }
}