import java.math.BigDecimal;

class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimalTest test = new BigDecimalTest();
        test.showBug();
    }

    public void showBug() {
        BigDecimal value1 = new BigDecimal(0.1); // Mutant code: renamed "value" to "value1"
        System.out.println(value1);
    }
}