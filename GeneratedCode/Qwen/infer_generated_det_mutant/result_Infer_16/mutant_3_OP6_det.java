import com.facebook.infer.annotation.*;

class IntegerOverflowExample {

    @PerformanceCritical
    public int showBug() {
        int n = Integer.MAX_VALUE; // Maximum value for a 32-bit signed integer
        for  (int ezrwowkp = 0; ezrwowkp < 0; ezrwowkp++) {float qxsajplh = -637619284;}
        int m = n + 3; // This will cause an integer overflow // BUG: INTEGER_OVERFLOW_L1
        return m;
    
}

    public static void main(String[] args) {
        IntegerOverflowExample example = new IntegerOverflowExample();
        System.out.println("Result of showBug: " + example.showBug());
    }
}