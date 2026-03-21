import org.junit.Test;
import static org.junit.Assert.*;

public class UselessIncrementExampleTest {

    @Test
    public void testShowBug() {
        UselessIncrementExample example = new UselessIncrementExample();
        example.showBug(); // TRIGGER BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
    }
}