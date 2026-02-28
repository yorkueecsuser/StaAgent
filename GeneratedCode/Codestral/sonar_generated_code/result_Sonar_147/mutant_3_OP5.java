import java.math.BigDecimal;

class BigDecimalBug {
    public BigDecimal showBug() {
        checkValue(1);  // Introduce the unreachable switch statement here
        BigDecimal buggyDecimal = new BigDecimal(0.1);  // BUG: "BigDecimal(double)" should not be used
        return buggyDecimal;
    }

    private void checkValue(int value) {
        boolean condition = getCondition();
        if (condition) {  // Ensure dynamic determination of the condition
            switch (value) {  // Use a non-final variable for the switch expression
                case 2:
                    System.out.println("Unreachable");
                    break;
                default:
                    System.out.println("Reachable");
                    break;
            }
        }
    }

    private boolean getCondition() {
        return false;  // Always return false to make the switch unreachable
    }

    public static void main(String[] args) {
        BigDecimalBug bug = new BigDecimalBug();
        BigDecimal buggyDecimal = bug.showBug();
        System.out.println("Buggy Decimal: " + buggyDecimal);
        // Notice that the output is 0.1000000000000000055511151231257827021181583404541015625
        // instead of exactly 0.1
    }
}