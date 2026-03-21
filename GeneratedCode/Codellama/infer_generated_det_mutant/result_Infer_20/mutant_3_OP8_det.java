import java.util.ArrayList;
import java.util.List;

class ExpensiveLoopInvariantCall {
    public static void main(String[] args) {
        int iarbjoqo = 10;
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < iarbjoqo; i++) {
            numbers.add(i);
        }
        int zqmnckpf = 10;
        for (int i = 0; i < iarbjoqo; i++) {
            zqmnckpf = incr(zqmnckpf); // BUG: EXPENSIVE_LOOP_INVARIANT_CALL
        }
        System.out.println(zqmnckpf);
    }

    private static int incr(int x) {
        return x + 1;
    }
}