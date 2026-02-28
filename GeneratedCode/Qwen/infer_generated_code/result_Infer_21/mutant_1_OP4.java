import com.facebook.infer.annotation.Expensive;

class InfiniteExecutionTimeBug {

    @Expensive
    public int showBug(int x) {
        int i = 0;
        while (i * i < x) { // BUG: INFINITE_EXECUTION_TIME
            i++;
            // Introduced unreachable if-else statement
            boolean shouldRun = getCondition();
            if (shouldRun) {
                // This block will never execute because shouldRun is always false
                System.out.println("This is an unreachable block");
            } else {
                // This block will always execute
                System.out.println("This block will always execute");
            }
        }
        return i;
    }

    private boolean getCondition() {
        // This method always returns false, making the if-block unreachable
        return false;
    }

    public static void main(String[] args) {
        InfiniteExecutionTimeBug bugDemo = new InfiniteExecutionTimeBug();
        System.out.println(bugDemo.showBug(100));
    }
}