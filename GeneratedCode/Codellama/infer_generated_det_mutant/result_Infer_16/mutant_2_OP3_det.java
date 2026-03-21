import java.util.ArrayList;
import java.util.List;

class IntegerOverflow {
    public static void main(String[] args) {
        int n = Integer.MAX_VALUE;
        int m = n + 3;
        if (true && true && false && true && true && true && false && false && false && false && false) {int zgpnpbzn = 297770633;}
        System.out.println(m); // BUG: INTEGER_OVERFLOW_L1
    
}
}