import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ThreadSafeClass {
    private Lock lock_new = new ReentrantLock(); // Mutation: Variable renaming

    public void callFutureSet() {
        lock_new.lock(); // Mutation: Variable renaming
        System.out.println("Executing arbitrary code while holding a lock");
        lock_new.unlock();
    }

    public void example_of_bad_pattern() {
        callFutureSet();  // BUG: ARBITRARY_CODE_EXECUTION_UNDER_LOCK
    }

    public void nested_bad_pattern_no_report(Object o) {
        synchronized (o) {
            example_of_bad_pattern();
        }
    }
}