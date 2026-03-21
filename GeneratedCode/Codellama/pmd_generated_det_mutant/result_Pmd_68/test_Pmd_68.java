import org.junit.Test;
import static org.junit.Assert.*;

class ReturnFromFinallyBlockTest {
    @Test
    public void testBug() {
        ReturnFromFinallyBlock rf = new ReturnFromFinallyBlock();
        try {
            rf.main(null);
            fail("Expected exception to be thrown");
        } catch (Exception e) {
            assertEquals("Invalid input!", e.getMessage());
        }
    }
}