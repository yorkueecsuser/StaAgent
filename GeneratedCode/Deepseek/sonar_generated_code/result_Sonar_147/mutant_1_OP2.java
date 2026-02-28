import java.math.BigDecimal;

class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimalTest test = new BigDecimalTest();
        test.showBug();
    }

    public void showBug() {
        BigDecimal value1 = new BigDecimal(0.1); // Mutant 1: Duplicated line
        BigDecimal value2 = new BigDecimal(0.1); // Mutant 2: Duplicated line
        System.out.println(value1);
        System.out.println(value2);
    }
}