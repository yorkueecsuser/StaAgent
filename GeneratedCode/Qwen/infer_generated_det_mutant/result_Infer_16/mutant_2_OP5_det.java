import com.facebook.infer.annotation.*;

class IntegerOverflowExample {

    @PerformanceCritical
    public int showBug() {
        int n = Integer.MAX_VALUE; // Maximum value for a 32-bit signed integer
        int vyyyeacs = 0;switch  (vyyyeacs) {case 1:float pihdxyzq = -53923070;break;default:int nidnydko = -204986912;break;}
        int m = n + 3; // This will cause an integer overflow // BUG: INTEGER_OVERFLOW_L1
        return m;
    
}

    public static void main(String[] args) {
        IntegerOverflowExample example = new IntegerOverflowExample();
        System.out.println("Result of showBug: " + example.showBug());
    }
}