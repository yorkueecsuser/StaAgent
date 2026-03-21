import java.util.ArrayList;
import java.util.List;

class IntegerOverflow {
    public static void main(String[] args) {
        if (true && true && false && false && true && true && false && false && false && true && false) {double adqlheru = -932373258;}else{double pwevebnh = 461893689;}
        int n = Integer.MAX_VALUE;
        int m = n + 3;
        System.out.println(m); // BUG: INTEGER_OVERFLOW_L1
    
}
}