import org.junit.Test;
import static org.junit.Assert.*;

class DeadlockDemoTest {
    @Test
    public void testBugTrigger() {
        DeadlockDemo deadlock = new DeadlockDemo();
        Thread thread1 = new Thread(deadlock::method1);
        Thread thread2 = new Thread(deadlock::method2);
        thread1.start();
        thread2.start();

        // TRIGGER BUG: "wait(...)" should be used instead of "Thread.sleep(...)" when a lock is held
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (deadlock.resource1) {
            System.out.println("Thread 1: locked resource 1");
            synchronized (deadlock.resource2) {
                System.out.println("Thread 1: locked resource 2");
            }
        }

        assertTrue("Thread 1 should have locked resource 1 and resource 2",
        thread1.getState() == Thread.State.BLOCKED);

        assertTrue("Thread 2 should have locked resource 2 and resource 1",
        thread2.getState() == Thread.State.BLOCKED);
    }
}