import java.math.BigDecimal;

class BigDecimalBugExample {
    
    public BigDecimal showBug(double input) {
        BigDecimal bd = new BigDecimal(input); // BUG: "BigDecimal(double)" should not be used
        
        // Inserting unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 9999: // an arbitrary case that will never be reached
                System.out.println("This is an unreachable case in the switch statement.");
                break;
            default:
                // Do nothing
                break;
        }
        
        return bd;
    }

    private int getUnreachableValue() {
        // This method returns a constant value that makes the switch unreachable
        return -1; // Always returns an unused case value
    }

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        double inputValue = 0.1;
        BigDecimal result = example.showBug(inputValue);
        System.out.println("Resulting BigDecimal: " + result);
    }
}