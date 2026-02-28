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
            if (false) {
                x = incr(x);
            }
        }
        System.out.println(x);
    }

    private static int incr(int x) {
        return x + 1;
    }
}