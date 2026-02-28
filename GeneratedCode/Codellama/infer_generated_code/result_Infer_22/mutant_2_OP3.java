import java.util.ArrayList;
import java.util.List;

class MutualRecursion {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        int result = factorial(numbers.get(0));
        System.out.println(result);
    }

    public static int factorial(int n) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            if (n > 0) {
                return n * factorial(n - 1); // BUG: MUTUAL_RECURSION_CYCLE
            } else {
                return 1;
            }
        } else {
            return 0;
        }
    }

    public static boolean getCondition() {
        return false;
    }
}