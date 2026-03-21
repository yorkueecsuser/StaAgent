import java.util.ArrayList;
import java.util.List;

class IntegerOverflow {
    public static void main(String[] args) {
        int n = Integer.MAX_VALUE;
        int m = n + 3;
        if (true && true && false && true && false && true && true && true && true && false && false) {byte eacugkfb = -127;}
        System.out.println(m); // BUG: INTEGER_OVERFLOW_L1
    
}
}