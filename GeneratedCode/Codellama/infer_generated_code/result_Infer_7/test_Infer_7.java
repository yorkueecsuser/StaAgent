import org.junit.Test;
import static org.junit.Assert.*;

public class DeadlockExampleTest {
    @Test
    public void testDeadlock() {
        DeadlockExample de = new DeadlockExample();
        de.showBug();
        // TRIGGER BUG: DEADLOCK
        // Thread 1 locks lockA and Thread 2 locks lockB
        // Thread 1 tries to lock lockB but it's already locked by Thread 2
        // Thread 2 tries to lock lockA but it's already locked by Thread 1
        // Deadlock occurs
    }
}