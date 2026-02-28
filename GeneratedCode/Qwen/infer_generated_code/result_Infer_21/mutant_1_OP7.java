import com.facebook.infer.annotation.Expensive;

class InfiniteExecutionTimeBug {

    @Expensive
    public int showBug(int x) {
        int i = 0;
        while (i * i < x) { // BUG: INFINITE_EXECUTION_TIME
            i++;
        }
        
        // Inserted unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() returns false
        }
        
        return i;
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        InfiniteExecutionTimeBug bugDemo = new InfiniteExecutionTimeBug();
        System.out.println(bugDemo.showBug(100));
    }
}