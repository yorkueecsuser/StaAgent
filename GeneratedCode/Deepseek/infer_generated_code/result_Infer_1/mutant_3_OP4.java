import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ThreadSafeClass {
    private Lock lock = new ReentrantLock();

    public void callFutureSet() {
        lock.lock();
        System.out.println("Executing arbitrary code while holding a lock");
        lock.unlock();
    }

    public void example_of_bad_pattern() {
        callFutureSet();  // BUG: ARBITRARY_CODE_EXECUTION_UNDER_LOCK
    }

    public void nested_bad_pattern_no_report(Object o) {
        synchronized (o) {
            example_of_bad_pattern();
        }
    }

    public void mutatedMethod() {
        boolean condition = true;
        if (condition) {
            // This code is unreachable based on the mutation operator
            System.out.println("This code is unreachable");
        } else {
            // This is the original branch
            callFutureSet();
        }
    }
}