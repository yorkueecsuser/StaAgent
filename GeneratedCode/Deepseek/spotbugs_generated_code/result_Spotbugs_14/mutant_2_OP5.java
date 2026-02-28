import java.math.BigDecimal;

class BigDecimalBug {
    public BigDecimal showBug() {
        double d = 0.1;
        BigDecimal bd = new BigDecimal(d); // BUG: DMI: BigDecimal constructed from double that isn’t represented precisely (DMI_BIGDECIMAL_CONSTRUCTED_FROM_DOUBLE)

        // Unreachable switch statement
        boolean shouldSwitch = alwaysFalse();
        switch (shouldSwitch) {
            case true:
                System.out.println("This line should never execute");
                break;
            default:
                break;
        }

        return bd;
    }

    private boolean alwaysFalse() {
        return false;
    }
}