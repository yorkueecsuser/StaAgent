import java.math.BigDecimal;

class BigDecimalBug {
    public BigDecimal showBug() {
        double d = 0.1;
        BigDecimal bd = new BigDecimal(d);

        boolean unreachableCondition = isUnreachable();
        if (unreachableCondition) {
            System.out.println("This line should never be executed.");
        }

        return bd;
    }

    private boolean isUnreachable() {
        return false;
    }
}