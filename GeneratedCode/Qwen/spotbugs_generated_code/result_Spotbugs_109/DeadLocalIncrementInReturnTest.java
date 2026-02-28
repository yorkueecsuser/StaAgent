import org.junit.Test;
import static org.junit.Assert.*;

public class DeadLocalIncrementInReturnTest {

    @Test
    public void testShowBug1() {
        DeadLocalIncrementInReturn example = new DeadLocalIncrementInReturn();
        assertEquals(5, example.showBug1(5)); // TRIGGER BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
    }

    @Test
    public void testShowBug2() {
        DeadLocalIncrementInReturn example = new DeadLocalIncrementInReturn();
        assertEquals(5, example.showBug2(5)); // TRIGGER BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
    }
}