import org.junit.Test;
import static org.junit.Assert.*;

public class DeadlockExampleTest {

    @Test
    public void testDeadlock() {
        DeadlockExample example = new DeadlockExample();
        example.showBug();  // TRIGGER BUG: "wait" should not be called when multiple locks are held
    }
}