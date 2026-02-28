import java.math.BigDecimal;

class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimalTest test = new BigDecimalTest();
        test.showBug();
    }

    public void showBug() {
        BigDecimal value = new BigDecimal(0.1); // BUG: "BigDecimal(double)" should not be used
        System.out.println(value);
    }

    // Mutant Code: Unreachable while loop
    public void unreachableWhileLoopMutant() {
        boolean conditionWhile = false; // non-final variable to avoid compile-time constant
        while (conditionWhile) {
            break; // Unreachable statement to avoid infinite loop
        }
    }
}