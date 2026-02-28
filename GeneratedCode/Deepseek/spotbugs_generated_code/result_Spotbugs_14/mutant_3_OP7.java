import java.math.BigDecimal;

class BigDecimalBug {
    public BigDecimal showBug() {
        double d = 0.1;
        BigDecimal bd = new BigDecimal(d); // Bug: DMI_BIGDECIMAL_CONSTRUCTED_FROM_DOUBLE

        // Mutation: Unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            System.out.println("This line will never be printed.");
        }

        return bd;
    }
}