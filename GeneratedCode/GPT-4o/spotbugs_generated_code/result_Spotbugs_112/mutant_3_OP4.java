class VariableMaskingExample {
    private int value = 10;

    public int showBug(int inputValue) {
        // Local variable 'value' masks the field 'value'
        int value = inputValue; // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
        
        // Unreachable if-else statement inserted as per mutation operator
        boolean condition = getCondition(); // This method always returns false
        if (condition) {
            // unreachable code block
            System.out.println("This will never print.");
        } else {
            // This block is reachable
            System.out.println("This else block is reachable.");
        }
        
        return value; // Returns the local variable, not the field
    }

    // This method is used to create an unreachable branch
    private boolean getCondition() {
        return false; // Always returns false to maintain unreachability
    }

    public static void main(String[] args) {
        VariableMaskingExample example = new VariableMaskingExample();
        System.out.println("Result: " + example.showBug(5)); // This will print 5, not the field's value 10
    }
}