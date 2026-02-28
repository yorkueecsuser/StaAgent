import org.junit.Test;
import static org.junit.Assert.*;

public class ReturnFromFinallyExampleTest {

    @Test
    public void testShowBug() {
        ReturnFromFinallyExample example = new ReturnFromFinallyExample();
        String result = example.showBug(); // TRIGGER BUG: ReturnFromFinallyBlock
        assertEquals("This test should fail due to exception being discarded", "My Exception", result); // TRIGGER BUG: ReturnFromFinallyBlock
    }
}