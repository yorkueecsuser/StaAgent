import java.math.BigDecimal;

class BigDecimalBug {
    public BigDecimal showBug() {
        BigDecimal buggyDecimal = new BigDecimal(0.1);

        // Added mutant code
        boolean unreachable = getCondition();
        for (int i = 0; unreachable; i++) {
            System.out.println("This loop should never execute");
        }

        return buggyDecimal;
    }

    private boolean getCondition() {
        // This method always returns false to make the loop unreachable
        return false;
    }

    public static void main(String[] args) {
        BigDecimalBug bug = new BigDecimalBug();
        BigDecimal buggyDecimal = bug.showBug();
        System.out.println("Buggy Decimal: " + buggyDecimal);
    }
}