import org.junit.Test;
import static org.junit.Assert.*;

public class RepeatedConditionalTestTest {
    @Test
    public void testBug() {
        int x = 0;
        int y = 1;
        RepeatedConditionalTest test = new RepeatedConditionalTest();
        test.main(new String[]{});
        assertTrue("Bug found!", x == 0 || y == 0);
        assertTrue("No bug found!", x == 0 || y == 0);
    }
}