class BitwiseSignBugExample {

    public boolean checkBitwiseOperation(int val, int constant) {
        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        return (val & constant) > 0; 
    }

    public String showBug(int val, int constant) {
        boolean result = checkBitwiseOperation(val, constant);
        
        // Adding an unreachable switch statement using a dynamically evaluated condition
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This case is never reached.");
                break;
            case 2:
                System.out.println("Neither is this one.");
                break;
            default:
                System.out.println("Default case, also unreachable.");
                break;
        }
        
        return "Result of bitwise check: " + result + " for val: " + val + " and constant: " + constant;
    }

    private int getUnreachableValue() {
        // This method always returns a value that doesn't match any case
        return 0;
    }

    public static void main(String[] args) {
        BitwiseSignBugExample example = new BitwiseSignBugExample();
        // Example call that demonstrates the bug
        System.out.println(example.showBug(5, -1));
    }
}