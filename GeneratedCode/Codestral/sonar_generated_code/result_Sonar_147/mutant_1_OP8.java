import java.math.BigDecimal;

class BigDecimalBug {
    public BigDecimal showBug() {
        BigDecimal buggyDecimal = new BigDecimal(0.1);  // Original code
        BigDecimal a = buggyDecimal;  // Mutated code: Renaming buggyDecimal to a
        return a;
    }

    public static void main(String[] args) {
        BigDecimalBug bug = new BigDecimalBug();
        BigDecimal a = bug.showBug();
        System.out.println("Buggy Decimal: " + a);
    }
}