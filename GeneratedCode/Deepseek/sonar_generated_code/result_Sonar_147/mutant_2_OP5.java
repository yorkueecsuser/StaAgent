import java.math.BigDecimal;

class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimalTest test = new BigDecimalTest();
        test.showBug();
    }

    public void showBug() {
        BigDecimal value = new BigDecimal(0.1); // BUG: "BigDecimal(double)" should not be used
        System.out.println(value);
        switch (getUnreachableValue()) {  // MUTANT: This is the unreachable switch statement
            case 1:
                System.out.println("This is unreachable");
                break;
            default:
                break;
        }
    }

    public int getUnreachableValue() {
        return 0;  // This method always returns 0, making the switch condition false
    }
}