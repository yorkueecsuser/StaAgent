import java.math.BigDecimal;

class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimalTest test = new BigDecimalTest();
        test.showBug();
    }

    public void showBug() {
        // The original line of code
        BigDecimal value = new BigDecimal(0.1); 

        // The mutated line of code
        String temp = "random";

        // The mutated code is left in place, do not remove from it only add code to it
        BigDecimal valueMutated = new BigDecimal(0.1); 

        System.out.println(valueMutated);
    }
}