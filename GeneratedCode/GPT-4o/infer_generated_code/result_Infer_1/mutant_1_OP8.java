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

// Mutated code with renamed variable
class ArbitraryCodeExecutionUnderLockExampleMutant {

    private final Lock a = new ReentrantLock();  // "lock" renamed to "a"
    private final List<Runnable> b = new ArrayList<>();  // "callbacks" renamed to "b"

    public void registerCallback(Runnable callback) {
        b.add(callback);  // "callbacks" replaced with "b"
    }

    public synchronized void executeCallbacks() {
        for (Runnable callback : b) {  // "callbacks" replaced with "b"
            callback.run();
        }
    }

    public void addCallbackAndExecute() {
        a.lock();  // "lock" replaced with "a"
        try {
            registerCallback(() -> {
                System.out.println("Executing in callback!");
                a.lock();  // "lock" replaced with "a"
                try {
                    System.out.println("Nested lock acquired inside callback");
                } finally {
                    a.unlock();  // "lock" replaced with "a"
                }
            });

            executeCallbacks();
        } finally {
            a.unlock();  // "lock" replaced with "a"
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