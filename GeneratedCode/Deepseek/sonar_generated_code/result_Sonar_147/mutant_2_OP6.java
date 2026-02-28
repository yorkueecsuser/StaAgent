import java.math.BigDecimal;

class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimalTest test = new BigDecimalTest();
        test.showBug();
    }

    public void showBug() {
        BigDecimal value = new BigDecimal(0.1); // BUG: "BigDecimal(double)" should not be used
        System.out.println(value);

        boolean unreachableCondition = false; // Added mutation: Unreachable for loop
        for (int i = 0; unreachableCondition; i++) {
            // Added mutation: Unreachable for loop
        }
    }
}