import java.math.BigDecimal;

class BigDecimalBug {
    public BigDecimal showBug() {
        double d = 0.1;
        BigDecimal bd = new BigDecimal(d); // BUG: DMI: BigDecimal constructed from double that isn’t represented precisely (DMI_BIGDECIMAL_CONSTRUCTED_FROM_DOUBLE)

        boolean condition = getCondition();
        if (condition) {
            int value = 0; // this value will always be 0, making the switch statement unreachable
            switch(value) {
                case 1:
                    System.out.println("Unreachable code");
                    break;
            }
        }

        return bd;
    }

    private boolean getCondition() {
        // This method should return a dynamic condition. For the purpose of this example, it always returns false.
        return false;
    }
}