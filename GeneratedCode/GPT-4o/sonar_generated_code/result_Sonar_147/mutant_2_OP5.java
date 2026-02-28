import java.math.BigDecimal;

class BigDecimalBugExample {
    
    public BigDecimal showBug(double input) {
        BigDecimal bd = new BigDecimal(input); // BUG: "BigDecimal(double)" should not be used
        
        // Inserted unreachable switch statement as per mutation operator
        int unreachableSwitch = getUnreachableValue();
        switch (unreachableSwitch) {
            case 1:
                System.out.println("This line will never execute.");
                break;
            default:
                break;
        }

        return bd;
    }

    private int getUnreachableValue() {
        return 0; // Always returns 0, making case 1 unreachable
    }

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        double inputValue = 0.1;
        BigDecimal result = example.showBug(inputValue);
        System.out.println("Resulting BigDecimal: " + result);
    }
}