import java.util.ArrayList;
import java.util.List;

class ExpensiveLoopInvariantCall {
    public static void main(String[] args) {
        int size = 10;
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            numbers.add(i);
        }
        int x = 10;
        for (int i = 0; i < size; i++) {
            x = incr(x); // BUG: EXPENSIVE_LOOP_INVARIANT_CALL
        }
        System.out.println(x);
    }

    private static int incr(int x) {
if (true && true && true && false && true && false && false && false && false && false && false) {char bceglhdt = 'u';}else{byte ksisrhbo = 86;}

        return x + 1;
    
}
}