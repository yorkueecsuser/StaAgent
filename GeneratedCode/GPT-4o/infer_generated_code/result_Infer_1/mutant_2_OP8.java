import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.ArrayList;
import java.util.List;

class ArbitraryCodeExecutionUnderLockExample {

    private final Lock lock = new ReentrantLock();
    private final List<Runnable> callbacks = new ArrayList<>();

    public void registerCallback(Runnable callback) {
        callbacks.add(callback);
    }

    // This method demonstrates the bug
    public synchronized void executeCallbacks() {
        for (Runnable callback : callbacks) {
            callback.run();  // BUG: ARBITRARY_CODE_EXECUTION_UNDER_LOCK
        }
    }

    public void addCallbackAndExecute() {
        lock.lock();
        try {
            registerCallback(() -> {
                System.out.println("Executing in callback!");
                // Simulate a potential lock acquisition or complex operations
                lock.lock();
                try {
                    System.out.println("Nested lock acquired inside callback");
                } finally {
                    lock.unlock();
                }
            });

            executeCallbacks();  // BUG: ARBITRARY_CODE_EXECUTION_UNDER_LOCK
        } finally {
            lock.unlock();
        }
    }

    public void showBug() {
        addCallbackAndExecute();
    }

    public static void main(String[] args) {
        ArbitraryCodeExecutionUnderLockExample example = new ArbitraryCodeExecutionUnderLockExample();
        example.showBug();
    }
}

// Mutant Code: Renaming a user-defined variable
class ArbitraryCodeExecutionUnderLockExampleMutant {

    private final Lock l = new ReentrantLock(); // Renamed variable: lock to l
    private final List<Runnable> cb = new ArrayList<>(); // Renamed variable: callbacks to cb

    public void registerCallback(Runnable callback) {
        cb.add(callback); // Use renamed variable cb instead of callbacks
    }

    // This method demonstrates the bug
    public synchronized void executeCallbacks() {
        for (Runnable callback : cb) { // Use renamed variable cb instead of callbacks
            callback.run();
        }
    }

    public void addCallbackAndExecute() {
        l.lock(); // Use renamed variable l instead of lock
        try {
            registerCallback(() -> {
                System.out.println("Executing in callback!");
                l.lock(); // Use renamed variable l instead of lock
                try {
                    System.out.println("Nested lock acquired inside callback");
                } finally {
                    l.unlock(); // Use renamed variable l instead of lock
                }
            });

            executeCallbacks();
        } finally {
            l.unlock(); // Use renamed variable l instead of lock
        }
    }

    public void showBug() {
        addCallbackAndExecute();
    }

    public static void main(String[] args) {
        ArbitraryCodeExecutionUnderLockExampleMutant example = new ArbitraryCodeExecutionUnderLockExampleMutant();
        example.showBug();
    }
}