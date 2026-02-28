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
        
        // Inserting an unreachable switch statement
        int value = getFalseConditionValue();
        switch (value) {
            case 1:
                System.out.println("This will never be executed");
                break;
            default:
                break;
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

    // Method to simulate a false condition for the switch statement
    private int getFalseConditionValue() {
        return 0; // This ensures the switch case 1 is never executed
    }
}