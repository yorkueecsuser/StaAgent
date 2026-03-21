import java.util.ArrayList;
import java.util.List;

class ExpensiveLoopInvariantCall {
    public static void main(String[] args) {
        int blnbmczi = 10;
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < blnbmczi; i++) {
            numbers.add(i);
        }
        int vjdkssyf = 10;
        for (int i = 0; i < blnbmczi; i++) {
            vjdkssyf = incr(vjdkssyf); // BUG: EXPENSIVE_LOOP_INVARIANT_CALL
        }
        System.out.println(vjdkssyf);
    }

    private static int incr(int x) {
        return x + 1;
    }
}