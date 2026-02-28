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
    
    // Mutant code being added 
    public void mutatedExample_of_bad_pattern() {
        lock.lock();
        System.out.println("Executing arbitrary code while holding a lock");
        lock.unlock();
        callFutureSet();  // BUG: ARBITRARY_CODE_EXECUTION_UNDER_LOCK
    }

    public void mutatedNested_bad_pattern_no_report(Object o) {
        synchronized (o) {
            mutatedExample_of_bad_pattern();
        }
    }
}