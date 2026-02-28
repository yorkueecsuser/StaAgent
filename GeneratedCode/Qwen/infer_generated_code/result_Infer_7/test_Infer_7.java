import org.junit.Test;
import static org.junit.Assert.*;

public class DeadlockExampleTest {

    @Test
    public void testShowBug() {
        DeadlockExample deadlockExample = new DeadlockExample();
        deadlockExample.showBug(); // TRIGGER BUG: DEADLOCK
    }

    @Test
    public void testShowBug2() {
        DeadlockExample deadlockExample = new DeadlockExample();
        deadlockExample.showBug2(); // TRIGGER BUG: DEADLOCK
    }
}