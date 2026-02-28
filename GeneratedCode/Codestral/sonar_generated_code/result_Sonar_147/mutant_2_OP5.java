import java.math.BigDecimal;

class BigDecimalBug {
    public BigDecimal showBug() {
        BigDecimal buggyDecimal = new BigDecimal(0.1);  // BUG: "BigDecimal(double)" should not be used

        // Unreachable switch statement mutant
        boolean shouldRun = false;
        if (shouldRun) {
            int value = 1;
            switch (value) {
                case 2:
                    System.out.println("This should not be printed");
                    break;
            }
        }

        return buggyDecimal;
    }

    public static void main(String[] args) {
        BigDecimalBug bug = new BigDecimalBug();
        BigDecimal buggyDecimal = bug.showBug();
        System.out.println("Buggy Decimal: " + buggyDecimal);
    }
}