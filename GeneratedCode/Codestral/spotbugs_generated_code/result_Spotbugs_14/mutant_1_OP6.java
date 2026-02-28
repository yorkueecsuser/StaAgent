import java.math.BigDecimal;

class BigDecimalBug {
    public BigDecimal showBug() {
        double d = 0.1;
        BigDecimal bd = new BigDecimal(d); // Original bug remains here.

        // Mutant code: Unreachable for loop
        for (int i = 0; getCondition(); i++) {
            System.out.println("This loop is unreachable");
        }

        return bd;
    }

    private boolean getCondition() {
        return false; // Always returns false to make the loop unreachable.
    }
}