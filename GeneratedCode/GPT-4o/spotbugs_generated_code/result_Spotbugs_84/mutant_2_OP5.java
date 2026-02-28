class BitwiseSignBugExample {

    public boolean checkBitwiseOperation(int val, int constant) {
        // BUG: BIT: Check for sign of bitwise operation involving negative number (BIT_SIGNED_CHECK_HIGH_BIT)
        return (val & constant) > 0; 
    }

    public String showBug(int val, int constant) {
        boolean result = checkBitwiseOperation(val, constant);

        // Inserting unreachable switch statement
        int unreachableSwitchVariable = getUnreachableValue();
        switch (unreachableSwitchVariable) {
            case 9999: // Assuming 9999 will not be returned by getUnreachableValue()
                System.out.println("This is an unreachable switch case.");
                break;
            default:
                // Default case that doesn't execute any code
                break;
        }

        return "Result of bitwise check: " + result + " for val: " + val + " and constant: " + constant;
    }

    private int getUnreachableValue() {
        // A method that returns a value that will not trigger the unreachable switch case
        return -1; // Or any other value that isn't 9999
    }

    public static void main(String[] args) {
        BitwiseSignBugExample example = new BitwiseSignBugExample();
        // Example call that demonstrates the bug
        System.out.println(example.showBug(5, -1));
    }
}