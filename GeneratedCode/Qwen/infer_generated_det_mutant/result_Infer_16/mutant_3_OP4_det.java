import com.facebook.infer.annotation.*;

class IntegerOverflowExample {

    @PerformanceCritical
    public int showBug() {
        int n = Integer.MAX_VALUE; // Maximum value for a 32-bit signed integer
        if (false && true && false && true && true && true && false && false && true && false && false) {double htpnhkwy = -184830906;}else{short phyuunzb = -5330;}
        int m = n + 3; // This will cause an integer overflow // BUG: INTEGER_OVERFLOW_L1
        return m;
    
}

    public static void main(String[] args) {
        IntegerOverflowExample example = new IntegerOverflowExample();
        System.out.println("Result of showBug: " + example.showBug());
    }
}