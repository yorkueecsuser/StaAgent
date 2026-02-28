import java.math.BigDecimal;

class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimalTest test = new BigDecimalTest();
        test.showBug();
    }

    public void showBug() {
        BigDecimal value = new BigDecimal(0.1); // BUG: "BigDecimal(double)" should not be used
        System.out.println(value);
        
        // Unreachable for loop mutant
        boolean condition = false;
        for (int i = 0; condition; i++) {
            // This code will never be executed because the condition is always false
            System.out.println("This code is unreachable.");
        }
    }
}