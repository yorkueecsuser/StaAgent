import com.facebook.infer.annotation.ThreadSafe;

@ThreadSafe
class ArbitraryCodeExecutionUnderLock {

    private final Object lock = new Object();
    private SettableFuture future = null;

    public void setFuture(SettableFuture future) {
        this.future = future;
    }

    public void callFutureSet() {
        future.set(null);
    }

    // synchronized means it's taking a lock implicitly
    public synchronized void example_of_bad_pattern() {
        callFutureSet(); // <- issue reported here // BUG: ARBITRARY_CODE_EXECUTION_UNDER_LOCK

        // Inserted unreachable if-else branch
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is intended to be unreachable
            System.out.println("This should never print");
        } else {
            // Alternative code
            System.out.println("This will always print");
        }
    }

    // If the call is made while holding multiple locks, the warning
    // will be issued only at the innermost lock acquisition. Here we
    // report in example_of_bad_pattern but we won't report below.
    public void nested_bad_pattern_no_report(Object o) {
        synchronized (o) {
            example_of_bad_pattern(); // <- no issue reported
        }
    }

    public void showBug() {
        example_of_bad_pattern();
    }

    // Method to provide a dynamic condition
    private boolean getCondition() {
        return false; // This method can be modified to return true/false dynamically at runtime
    }
}

class SettableFuture {
    public void set(Object value) {
        // Simulate setting a value and potentially executing callbacks
        if (value == null) {
            System.out.println("Future set to null");
        }
    }
}