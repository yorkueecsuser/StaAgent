import java.util.Random;

// Custom annotation for methods that should be inlined
@interface InlineMe {}

class InlineMeValidatorBug {

    @InlineMe // BUG: InlineMeValidator - This annotation is used incorrectly. The method performs a complex calculation.
    public static int expensiveMethod(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void showBug(int r) { // Mutated: Renamed 'n' to 'r'
        System.out.println(expensiveMethod(r));
    }

    public static void main(String[] args) {
        showBug(5);
    }
}