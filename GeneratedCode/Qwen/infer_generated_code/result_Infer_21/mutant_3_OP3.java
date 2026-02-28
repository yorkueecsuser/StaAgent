import com.facebook.infer.annotation.Expensive;

class InfiniteExecutionTimeBug {

    @Expensive
    public int showBug(int x) {
        int i = 0;
        while (i * i < x) { // BUG: INFINITE_EXECUTION_TIME
            i++;
            // Inserting unreachable if branch
            boolean condition = getUnreachableCondition();
            if (condition) {
                System.out.println("This is an unreachable statement");
            }
        }
        return i;
    }

    private boolean getUnreachableCondition() {
        return false; // This method will always return false, but it's not a compile-time constant in the context of the if statement
    }

    public static void main(String[] args) {
        InfiniteExecutionTimeBug bugDemo = new InfiniteExecutionTimeBug();
        System.out.println(bugDemo.showBug(100));
    }
}