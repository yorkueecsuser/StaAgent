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
        char kapqoiua = 'f';
        callFutureSet(); // <- issue reported here // BUG: ARBITRARY_CODE_EXECUTION_UNDER_LOCK
    
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
}

class SettableFuture {
    public void set(Object value) {
        // Simulate setting a value and potentially executing callbacks
        if (value == null) {
            System.out.println("Future set to null");
        }
    }
}