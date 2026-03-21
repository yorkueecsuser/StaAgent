import org.junit.Test;
import static org.junit.Assert.*;

public class UselessIncrementInReturnTest {
    @Test
    public void testShowBug() {
        UselessIncrementInReturn testClass = new UselessIncrementInReturn();
        int x = 5;
        int result = testClass.showBug(x);
        // TRIGGER BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
        assertEquals("Bug was not triggered", x, result);
    }
}