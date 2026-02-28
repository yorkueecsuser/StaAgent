import java.math.BigDecimal;

class BigDecimalBug {
    private boolean getCondition() {
        return false; // This condition will always be false, making the if-else block unreachable
    }

    public BigDecimal showBug() {
        double d = 0.1;
        BigDecimal bd = new BigDecimal(d); // Original bug remains in place

        // Mutant: Unreachable if-else statement
        if (getCondition()) {
            // This block is unreachable
            System.out.println("This line should never execute");
        } else {
            // This block is also unreachable
            System.out.println("Neither should this line");
        }

        return bd;
    }
}