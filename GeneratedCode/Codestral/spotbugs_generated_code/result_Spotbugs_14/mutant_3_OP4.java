import java.math.BigDecimal;

class BigDecimalBug {
    public BigDecimal showBug() {
        double d = 0.1;
        BigDecimal bd = new BigDecimal(d); // BUG: DMI: BigDecimal constructed from double that isn’t represented precisely (DMI_BIGDECIMAL_CONSTRUCTED_FROM_DOUBLE)

        boolean shouldRun = false;
        if (shouldRun) {
            // Unreachable code to demonstrate the mutation operator
            System.out.println("This code will never execute");
        } else {
            // This else block will always execute due to the false condition
            System.out.println("This code is always executed");
        }

        return bd;
    }
}