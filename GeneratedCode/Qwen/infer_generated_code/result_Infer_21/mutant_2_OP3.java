import com.facebook.infer.annotation.Expensive;

class InfiniteExecutionTimeBug {

    @Expensive
    public int showBug(int x) {
        int i = 0;
        while (i * i < x) { // BUG: INFINITE_EXECUTION_TIME
            i++;
            boolean condition = getCondition();
            if (condition) { // Unreachable if statement
                System.out.println("This is an unreachable statement");
            }
        }
        return i;
    }

    private boolean getCondition() {
        return false; // This method will always return false, but it's not a compile-time constant
    }

    public static void main(String[] args) {
        InfiniteExecutionTimeBug bugDemo = new InfiniteExecutionTimeBug();
        System.out.println(bugDemo.showBug(100));
    }
}