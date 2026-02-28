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

    @Expensive
    public int showBugWithMutant(int x) {
        int a = 0; // Renamed 'i' to 'a'
        while (a * a < x) { // BUG: INFINITE_EXECUTION_TIME
            a++;
        }
        return a;
    }

    public static void main(String[] args) {
        InfiniteExecutionTimeBug bugDemo = new InfiniteExecutionTimeBug();
        System.out.println(bugDemo.showBug(100));
        System.out.println(bugDemo.showBugWithMutant(100)); // Added call to mutant method
    }
}