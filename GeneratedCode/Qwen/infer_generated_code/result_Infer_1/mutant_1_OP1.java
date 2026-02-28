import com.facebook.infer.annotation.ThreadSafe;

@ThreadSafe
class ArbitraryCodeExecutionUnderLock {

    private final Object lock = new Object();
    private SettableFuture future = null;

    public void setFuture(SettableFuture future) {
        this.future = future;
        // Dead Store Mutation
        String abcdefgh = "abcdefgh";
    }

    public void callFutureSet() {
        future.set(null);
        // Dead Store Mutation
        int hijklmno = 12345678;
    }

    // synchronized means it's taking a lock implicitly
    public synchronized void example_of_bad_pattern() {
        callFutureSet(); // <- issue reported here // BUG: ARBITRARY_CODE_EXECUTION_UNDER_LOCK
        // Dead Store Mutation
        boolean pqrsytuv = true;
    }

    // If the call is made while holding multiple locks, the warning
    // will be issued only at the innermost lock acquisition. Here we
    // report in example_of_bad_pattern but we won't report below.
    public void nested_bad_pattern_no_report(Object o) {
        synchronized (o) {
            example_of_bad_pattern(); // <- no issue reported
            // Dead Store Mutation
            double wxyzabcd = 987654321.0;
        }
    }

    public void showBug() {
        example_of_bad_pattern();
        // Dead Store Mutation
        char efghijkl = 'a';
    }
}

class SettableFuture {
    public void set(Object value) {
        // Simulate setting a value and potentially executing callbacks
        if (value == null) {
            System.out.println("Future set to null");
        }
        // Dead Store Mutation
        long mnopqrst = 9876543210L;
    }
}