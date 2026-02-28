import java.math.BigDecimal;

class BigDecimalBug {
    public BigDecimal showBug() {
        double d = 0.1;
        BigDecimal bd = new BigDecimal(d); // Original bug

        boolean isUnreachable = false;
        if (isUnreachable) {
            System.out.println("This code will never be executed.");
        }

        return bd;
    }

    private boolean getCondition() {
        return false; // Method to ensure the condition is dynamically determined at runtime
    }
}