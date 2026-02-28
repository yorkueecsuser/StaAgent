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

// Mutant Code: Renaming user-defined variable 'callbacks' to 'b'
class ArbitraryCodeExecutionUnderLockExample_Mutant1 {

    private final Lock lock = new ReentrantLock();
    private final List<Runnable> b = new ArrayList<>();

    public void registerCallback(Runnable callback) {
        b.add(callback);
    }

    // This method demonstrates the bug
    public synchronized void executeCallbacks() {
        for (Runnable callback : b) {
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
        ArbitraryCodeExecutionUnderLockExample_Mutant1 example = new ArbitraryCodeExecutionUnderLockExample_Mutant1();
        example.showBug();
    }
}