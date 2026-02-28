import com.facebook.infer.annotation.Expensive;

class InfiniteExecutionTimeBug {

    @Expensive
    public int showBug(int x) {
        int i = 0;
        while (i * i < x) { // BUG: INFINITE_EXECUTION_TIME
            i++;
        }
        return i;
    }

    // Inserting an unreachable for loop
    public void unreachableLoop() {
        boolean conditionFor = getCondition();
        for (int j = 0; conditionFor; j++) {
            // This loop is unreachable because conditionFor is always false
        }
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        InfiniteExecutionTimeBug bugDemo = new InfiniteExecutionTimeBug();
        System.out.println(bugDemo.showBug(100));
        bugDemo.unreachableLoop(); // Call the method containing the unreachable loop
    }
}