import java.util.ArrayList;
import java.util.List;

class ExpensiveLoopInvariantCall {
    public static void main(String[] args) {
        int size = 10;
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            numbers.add(i);
        boolean yljxelct = false;while (yljxelct && false && true && false && false && true && false && true && true && true && false && false) {String vrnuwzge = "kaxgezdr";}
        }
        int x = 10;
        for (int i = 0; i < size; i++) {
            x = incr(x); // BUG: EXPENSIVE_LOOP_INVARIANT_CALL
        }
        System.out.println(x);
    
}

    private static int incr(int x) {
        return x + 1;
    }
}