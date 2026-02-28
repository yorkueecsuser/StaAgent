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
        // Unreachable while loop added as a mutant
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This block is theoretically unreachable
            System.out.println("This is an unreachable while loop");
        }

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

    // Method to simulate dynamic condition
    private boolean getCondition() {
        return false; // This method simulates a condition that is always false
    }

    public static void main(String[] args) {
        ArbitraryCodeExecutionUnderLockExample example = new ArbitraryCodeExecutionUnderLockExample();
        example.showBug();
    }
}