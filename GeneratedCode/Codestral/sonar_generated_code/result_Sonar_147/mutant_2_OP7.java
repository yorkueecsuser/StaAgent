import java.math.BigDecimal;

class BigDecimalBug {
    public BigDecimal showBug() {
        BigDecimal buggyDecimal = new BigDecimal(0.1);  // BUG: "BigDecimal(double)" should not be used

        // Mutant Code: Unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            System.out.println("This loop is unreachable");
        }

        return buggyDecimal;
    }

    public static void main(String[] args) {
        BigDecimalBug bug = new BigDecimalBug();
        BigDecimal buggyDecimal = bug.showBug();
        System.out.println("Buggy Decimal: " + buggyDecimal);
        // Notice that the output is 0.1000000000000000055511151231257827021181583404541015625
        // instead of exactly 0.1
    }
}