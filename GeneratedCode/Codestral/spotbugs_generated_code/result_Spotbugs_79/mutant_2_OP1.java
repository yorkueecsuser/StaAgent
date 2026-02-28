import java.util.Random;

class IntComparisonBug {
    public boolean showBug(int value) {
        // BUG: INT: Bad comparison of int value with long constant (INT_BAD_COMPARISON_WITH_INT_VALUE)
        // Dead Code: Unused variable 'deadcode'
        int deadcode = new Random().nextInt();
        return value == 2147483648L;
    }

    public static void main(String[] args) {
        IntComparisonBug bug = new IntComparisonBug();
        boolean result = bug.showBug(Integer.MAX_VALUE);
        System.out.println("Result: " + result);
    }
}