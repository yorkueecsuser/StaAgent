import java.math.BigDecimal;

class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimalTest test = new BigDecimalTest();
        test.showBug();
    }

    public void showBug() {
        BigDecimal value = new BigDecimal(0.1); 
        System.out.println(value);

        // Mutated code: Unreachable while loop
        boolean unreachable = false;
        while (unreachable) {
            System.out.println("This will never be executed");
        }
    }
}