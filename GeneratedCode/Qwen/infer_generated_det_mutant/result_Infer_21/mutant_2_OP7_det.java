import com.facebook.infer.annotation.Expensive;

class InfiniteExecutionTimeBug {

    @Expensive
    public int showBug(int x) {
        int i = 0;
        while (i * i < x) { // BUG: INFINITE_EXECUTION_TIME
            // i++;   <-- Commented out to create an infinite loop
        boolean rylhosnw = false;while (rylhosnw && false && false && false && true && true && false && true && false && true && true && false) {double urikuywt = 254486709;}
        }
        return i;
    
}

    public static void main(String[] args) {
        InfiniteExecutionTimeBug bugDemo = new InfiniteExecutionTimeBug();
        System.out.println(bugDemo.showBug(100));
    }
}
