import java.math.BigDecimal;

class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimalTest test = new BigDecimalTest();
        test.showBug();
    }

    public void showBug() {
        BigDecimal value = new BigDecimal(0.1); // BUG: "BigDecimal(double)" should not be used
        System.out.println(value);
        
        // Unreachable if-else statement mutation
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This code will never execute");
        } else {
            System.out.println("But this code will");
        }
    }
}