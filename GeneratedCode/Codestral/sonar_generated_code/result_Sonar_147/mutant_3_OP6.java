import java.math.BigDecimal;

class BigDecimalBug {
    public BigDecimal showBug() {
        // Inserted unreachable for loop
        boolean unreachableCondition = false;
        for (int i = 0; unreachableCondition; i++) {
            System.out.println("Unreachable code");
        }

        BigDecimal buggyDecimal = new BigDecimal(0.1);  // BUG: "BigDecimal(double)" should not be used
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