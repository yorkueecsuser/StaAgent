import com.facebook.infer.annotation.Expensive;

class InfiniteExecutionTimeBug {

    @Expensive
    public int showBug(int x) {
        int i = 0;
        while (i * i < x) { // BUG: INFINITE_EXECUTION_TIME
            // i++;   <-- Commented out to create an infinite loop
        boolean nnxdpfji = false;while (nnxdpfji && true && true && true && false && false && false && true && false && false && false && false) {float efzwvtcj = 59083518;}
        }
        return i;
    
}

    public static void main(String[] args) {
        InfiniteExecutionTimeBug bugDemo = new InfiniteExecutionTimeBug();
        System.out.println(bugDemo.showBug(100));
    }
}
