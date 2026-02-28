import java.math.BigDecimal;

class BigDecimalBug {
    public BigDecimal showBug() {
        BigDecimal buggyDecimal = new BigDecimal(0.1);
        boolean unreachableCondition = false;

        if (unreachableCondition) {
            System.out.println("This branch should never be executed!");
        } else {
            // This is the original code
            return buggyDecimal;
        }
    }

    public static void main(String[] args) {
        BigDecimalBug bug = new BigDecimalBug();
        BigDecimal buggyDecimal = bug.showBug();
        System.out.println("Buggy Decimal: " + buggyDecimal);
    }
}