import java.math.BigDecimal;

class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimalTest test = new BigDecimalTest();
        test.showBug();
    }

    public void showBug() {
        BigDecimal value = new BigDecimal(0.1); // BUG: "BigDecimal(double)" should not be used
        System.out.println(value);

        // Mutation: Adding an unreachable switch statement
        int a = 0;
        switch(a) {
            case 0:
                break;
            default:
                break;
        }
    }
}