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
        callFutureSet();  // Mutation: Unreachable if-else statement
    }

    public void nested_bad_pattern_no_report(Object o) {
        synchronized (o) {
            example_of_bad_pattern();
        }
    }

    // Mutation: Unreachable if-else statement
    public void unreachableIfElseStatement() {
        boolean shouldRun = false;  // Make this condition unreachable
        if (shouldRun) {
            System.out.println("This code will never be executed");
        } else {
            System.out.println("This code will be executed");
        }
    }
}