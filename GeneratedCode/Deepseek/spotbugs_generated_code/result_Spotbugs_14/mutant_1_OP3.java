import java.math.BigDecimal;

class BigDecimalBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public BigDecimal showBug() {
        double d = 0.1;
        BigDecimal bd = new BigDecimal(d);

        if (getUnreachableCondition()) {
            System.out.println("This line will never be executed.");
        }

        return bd;
    }
}