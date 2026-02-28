import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ThreadSafeClass {
    private Lock newLock = new ReentrantLock();

    public void newCallFutureSet() {
        newLock.lock();
        System.out.println("Executing arbitrary code while holding a lock");
        newLock.unlock();
    }

    public void example_of_bad_pattern() {
        newCallFutureSet();  // BUG: ARBITRARY_CODE_EXECUTION_UNDER_LOCK
    }

    public void nested_bad_pattern_no_report(Object o) {
        synchronized (o) {
            example_of_bad_pattern();
        }
    }
}