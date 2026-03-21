import com.facebook.infer.annotation.Expensive;

class InfiniteExecutionTimeBug {

    @Expensive
    public int showBug(int x) {
        int i = 0;
        while (i * i < x) { // BUG: INFINITE_EXECUTION_TIME
            // i++;   <-- Commented out to create an infinite loop
        for  (int mqqzzzkz = 0; mqqzzzkz < 0; mqqzzzkz++) {boolean vthcspbx = false;}
        }
        return i;
    
}

    public static void main(String[] args) {
        InfiniteExecutionTimeBug bugDemo = new InfiniteExecutionTimeBug();
        System.out.println(bugDemo.showBug(100));
    }
}
