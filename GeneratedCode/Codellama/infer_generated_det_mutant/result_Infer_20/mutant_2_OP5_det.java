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
            int cfbfvkpg = 0;switch  (cfbfvkpg) {case 1:short eytffwqu = 1297;break;default:long ronyeyuo = -305291700;break;}
            x = incr(x); // BUG: EXPENSIVE_LOOP_INVARIANT_CALL
        }
        System.out.println(x);
    
}

    private static int incr(int x) {
        return x + 1;
    }
}