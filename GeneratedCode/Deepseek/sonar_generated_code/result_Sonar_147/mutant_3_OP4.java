import java.math.BigDecimal;

class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimalTest test = new BigDecimalTest();
        test.showBug();
    }

    public void showBug() {
        BigDecimal value = new BigDecimal(0.1); // BUG: "BigDecimal(double)" should not be used
        System.out.println(value);
        if (false) {
            // Unreachable code
            System.out.println("This code is unreachable");
        }
    }
}