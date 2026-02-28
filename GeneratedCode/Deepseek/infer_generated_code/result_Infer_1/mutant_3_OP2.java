import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class ThreadSafeClass {
    private Lock lock = new ReentrantLock();

    public void callFutureSet() {
        lock.lock();
        System.out.println("Executing arbitrary code while holding a lock");
        lock.unlock();
    }

    // Mutated code starting
    // Mutant 1: CallFutureSetDuplication
    public void callFutureSetDuplication() {
        lock.lock();
        System.out.println("Executing arbitrary code while holding a lock");
        lock.unlock();

        lock.lock();
        System.out.println("Executing arbitrary code while holding a lock");
        lock.unlock();
    }
    // Mutated code ending

    public void example_of_bad_pattern() {
        callFutureSetDuplication();  // This will call the mutated method
    }

    public void nested_bad_pattern_no_report(Object o) {
        synchronized (o) {
            example_of_bad_pattern();
        }
    }
}