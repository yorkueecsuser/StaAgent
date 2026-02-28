import java.math.BigDecimal;

class BigDecimalBugExample {

    public BigDecimal showBug(double value) {
        BigDecimal bd = new BigDecimal(value); // BUG: DMI: BigDecimal constructed from double that isn’t represented precisely (DMI_BIGDECIMAL_CONSTRUCTED_FROM_DOUBLE)
        
        int condition = getUnreachableCondition();
        switch (condition) {
            case 1:
                System.out.println("This case is unreachable.");
                break;
            default:
                // This default block is deliberately left empty
                break;
        }
        
        return bd;
    }

    private int getUnreachableCondition() {
        // This method returns a constant value that is not matched in the switch statement
        return 0;
    }

    public static void main(String[] args) {
        BigDecimalBugExample example = new BigDecimalBugExample();
        BigDecimal result = example.showBug(0.1);
        System.out.println("BigDecimal value created from double 0.1: " + result);
    }
}