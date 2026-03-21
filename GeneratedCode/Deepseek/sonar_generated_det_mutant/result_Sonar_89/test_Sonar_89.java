import org.junit.Test;
import static org.junit.Assert.*;

public class SynchronizationBugTest {

    private SynchronizationBug bug = new SynchronizationBug();

    @Test
    public void testSetterNotSynchronized() { // TRIGGER BUG: Getters and setters should be synchronized in pairs
        Runnable runnable = () -> {
            for(int i = 0; i < 10000; i++) {
                bug.setValue(i);
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(() -> {
            for(int i = 0; i < 10000; i++) {
                System.out.println(bug.getValue());
            }
        });

        thread1.start();
        thread2.start();

        bug.showBug(); // This call is important to trigger the bug
    }
}