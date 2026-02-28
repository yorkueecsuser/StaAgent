import java.math.BigDecimal;

class BigDecimalBug {
    public BigDecimal showBug() {
        double d = 0.1;
        BigDecimal bd;

        // Introducing a for loop that doesn't affect the BigDecimal creation
        for (int i = 0; i < 1; i++) {
            bd = new BigDecimal(d); // BUG: DMI: BigDecimal constructed from double that isn’t represented precisely (DMI_BIGDECIMAL_CONSTRUCTED_FROM_DOUBLE)
        }

        // Mutation: Equivalent Loop Replacement
        int i = 0;
        do {
            // bd = new BigDecimal(d); // Commenting out this line to avoid redundant assignment
            i++;
        } while (i < 1);

        return bd;
    }
}