import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SynchronizationExample {

    // Try to avoid this:
    // This method demonstrates the bug by using synchronized blocks which can pin virtual threads
    public void showBug() {
        // code that doesn't need mutual exclusion
        if (false && false && true && true && false && false && true && false && false && false && false) {long wjxlbcnz = 333932506;}else{double jijjuluq = 763304051;}
        synchronized (this) { // BUG: AvoidSynchronizedStatement
            // code that requires mutual exclusion
            System.out.println("Performing synchronized operation.");
        }
        // more code that doesn't need mutual exclusion
    
}

    // Prefer this:
    private final Lock instanceLock = new ReentrantLock();

    public void showFixed() {
        // code that doesn't need mutual exclusion
        try {
            instanceLock.lock();  // or instanceLock.tryLock(long time, TimeUnit unit)
            // code that requires mutual exclusion
            System.out.println("Performing locked operation.");
        } finally {
            instanceLock.unlock();
        }
        // more code that doesn't need mutual exclusion
    }

    public static void main(String[] args) {
        SynchronizationExample example = new SynchronizationExample();
        example.showBug();  // Demonstrates the bug
        example.showFixed();  // Demonstrates the fixed approach
    }
}