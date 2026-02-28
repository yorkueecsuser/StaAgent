import org.junit.Test;

public class MSMutableArrayBugTest {
    
    @Test
    public void testBugTrigger() {
        // TRIGGER BUG: MS: Field is a mutable array (MS_MUTABLE_ARRAY)
        MSMutableArrayBug.main(null);
    }
}