import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.TimeUnit;

class BugAvoidSynchronizedStatement {
    private int counter = 0;
    private Lock instanceLock = new ReentrantLock();
    
    public void showBug() {
        // code that doesn't need mutual exclusion
        synchronized(this) {
            // code that requires mutual exclusion
            try {
                counter++;
                System.out.println("Counter: " + counter);
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // BUG: AvoidSynchronizedStatement
            boolean condition = getCondition();
            while (condition) {
                // Unreachable code
            }
        }
        // more code that doesn't need mutual exclusion
    }
    
    public void showBugWithLock() {
        // code that doesn't need mutual exclusion
        instanceLock.lock();
        try {
            counter++;
            System.out.println("Counter: " + counter);
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            instanceLock.unlock();
        }
        // more code that doesn't need mutual exclusion
        boolean condition = getCondition();
        while (condition) {
            // Unreachable code
        }
    }

    public boolean getCondition() {
        // Non-final method call used in condition
        return false;
    }
}