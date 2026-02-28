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
        // Adding unreachable if-else statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This code is unreachable.");
        } else {
            for (Runnable callback : callbacks) {
                callback.run();  // BUG: ARBITRARY_CODE_EXECUTION_UNDER_LOCK
            }
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

            // Adding unreachable if-else statement
            boolean condition = getUnreachableCondition();
            if (condition) {
                System.out.println("This code is unreachable.");
            } else {
                executeCallbacks();  // BUG: ARBITRARY_CODE_EXECUTION_UNDER_LOCK
            }
        } finally {
            lock.unlock();
        }
    }

    // Method to simulate a condition that always returns false
    private boolean getUnreachableCondition() {
        return false;
    }

    public void showBug() {
        addCallbackAndExecute();
    }

    public static void main(String[] args) {
        ArbitraryCodeExecutionUnderLockExample example = new ArbitraryCodeExecutionUnderLockExample();
        example.showBug();
    }
}