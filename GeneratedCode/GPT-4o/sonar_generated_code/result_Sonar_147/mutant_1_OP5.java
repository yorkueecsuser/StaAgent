import java.math.BigDecimal;

class BigDecimalBugExample {
    
    public BigDecimal showBug(double input) {
        BigDecimal bd = new BigDecimal(input); // BUG: "BigDecimal(double)" should not be used
        return bd;
    }

    private int getUnreachableSwitchValue() {
        return 2; // This value is hardcoded and will not match the case in the switch statement
    }

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        double inputValue = 0.1;
        BigDecimal result = example.showBug(inputValue);
        System.out.println("Resulting BigDecimal: " + result);

        // Introducing unreachable switch statement
        BigDecimalBugExample additionalExample = new BigDecimalBugExample();
        int unreachableValue = additionalExample.getUnreachableSwitchValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This case is unreachable.");
                break;
            // No case matches the value of unreachableValue (2), making the switch statement effectively unreachable
            default:
                // Default case to ensure switch statement compiles successfully
                break;
        }
    }
}