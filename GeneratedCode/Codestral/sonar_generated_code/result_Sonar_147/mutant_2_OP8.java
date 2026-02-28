import java.math.BigDecimal;

class BigDecimalBug {
    public BigDecimal showBug() {
        BigDecimal buggyDecimal = new BigDecimal(0.1);  // Original line
        BigDecimal renamedBuggyDecimal = buggyDecimal;  // Mutant line: Renaming the variable
        return renamedBuggyDecimal;
    }

    public static void main(String[] args) {
        BigDecimalBug bug = new BigDecimalBug();
        BigDecimal renamedBuggyDecimal = bug.showBug();  // Updating the variable name in the main method
        System.out.println("Buggy Decimal: " + renamedBuggyDecimal);
        // Notice that the output is 0.1000000000000000055511151231257827021181583404541015625
        // instead of exactly 0.1
    }
}