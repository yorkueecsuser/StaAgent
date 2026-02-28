import com.facebook.infer.annotation.Expensive;

class InfiniteExecutionTimeBug {

    @Expensive
    public int showBug(int x) {
        int i = 0;
        while (i * i < x) { // BUG: INFINITE_EXECUTION_TIME
            i++;
            boolean shouldRun = getCondition();
            if (shouldRun) {
                // This block is reachable but does nothing specific
            } else {
                // This block is also reachable but does nothing specific
            }
        }
        return i;
    }

    private boolean getCondition() {
        // This method returns a condition that is dynamically determined at runtime
        return false; // This is safe as per the guidelines because it's a method call
    }

    public static void main(String[] args) {
        InfiniteExecutionTimeBug bugDemo = new InfiniteExecutionTimeBug();
        System.out.println(bugDemo.showBug(100));
    }
}