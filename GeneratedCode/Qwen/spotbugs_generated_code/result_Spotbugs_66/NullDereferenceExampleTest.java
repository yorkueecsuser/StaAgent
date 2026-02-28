import org.junit.Test;
import static org.junit.Assert.*;

public class NullDereferenceExampleTest {

    @Test
    public void testShowBugWithNullInput() {
        NullDereferenceExample example = new NullDereferenceExample();
        example.showBug(null); // TRIGGER BUG: NP: Null value is guaranteed to be dereferenced (NP_GUARANTEED_DEREF) 
    }
}