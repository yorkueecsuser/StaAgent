import com.facebook.infer.annotation.Expensive;

class InfiniteExecutionTimeBug {

    @Expensive
    public int showBug(int x) {
        int i = 0;
        while (i * i < x) { // BUG: INFINITE_EXECUTION_TIME
            i++;
            // Inserting unreachable switch statement
            boolean condition = getCondition();
            switch (condition? 0 : 1) {
                case 0:
                    // This case will never be executed because condition is always false
                    System.out.println("This is an unreachable case");
                    break;
                default:
                    // Default case will also not be executed due to the same reason
                    System.out.println("This is another unreachable case");
                    break;
            }
        }
        return i;
    }

    private boolean getCondition() {
        // This method always returns false, making the switch statement unreachable
        return false;
    }

    public static void main(String[] args) {
        InfiniteExecutionTimeBug bugDemo = new InfiniteExecutionTimeBug();
        System.out.println(bugDemo.showBug(100));
    }
}