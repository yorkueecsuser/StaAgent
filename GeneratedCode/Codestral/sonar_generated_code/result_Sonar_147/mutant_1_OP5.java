import java.math.BigDecimal;

class BigDecimalBug {
    private boolean getFalseCondition() {
        return false;
    }

    public BigDecimal showBug() {
        BigDecimal buggyDecimal = new BigDecimal(0.1);

        if (getFalseCondition()) {
            switch (buggyDecimal.intValue()) {
                case 1: // This case will never be reached
                    System.out.println("Unreachable case");
                    break;
                default:
                    break;
            }
        }

        return buggyDecimal;
    }

    // The rest of the code remains the same
}