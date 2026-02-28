import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.ArrayList;
import java.util.List;

class ArbitraryCodeExecutionUnderLockExample {

    private final Lock lock = new ReentrantLock();
    private final List<Runnable> callbacks = new ArrayList<>();

    public void registerCallback(Runnable callback) {
        callbacks.add(callback);
        
        // Add unreachable if-else statement
        boolean condition = getCondition(); // Dynamic condition
        if (condition) {
            System.out.println("This will never run.");
        } else {
            System.out.println("Callback registered."); // Always runs
        }
    }

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
                
                boolean nestedCondition = getNestedCondition(); // Another dynamic condition
                if (nestedCondition) {
                    System.out.println("Nested unreachable code.");
                } else {
                    System.out.println("Callback execution."); // Always runs
                }
                
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
    
    private boolean getCondition() {
        return false; // Always false to ensure the if-block above is unreachable
    }
    
    private boolean getNestedCondition() {
        return false; // Always false to ensure nested if-block above is unreachable
    }

    public static void main(String[] args) {
        ArbitraryCodeExecutionUnderLockExample example = new ArbitraryCodeExecutionUnderLockExample();
        example.showBug();
    }
}