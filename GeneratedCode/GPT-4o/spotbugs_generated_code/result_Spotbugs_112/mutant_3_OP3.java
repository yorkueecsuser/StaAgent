class VariableMaskingExample {
    private int value = 10;

    public int showBug(int inputValue) {
        // Local variable 'value' masks the field 'value'
        int value = inputValue; // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)

        // Introducing an unreachable if statement using a non-final variable
        boolean condition = getCondition(); // This will always return false
        if (condition) {
            System.out.println("This will never be printed.");
        }

        return value; // Returns the local variable, not the field
    }
    
    // Helper method to ensure the condition is dynamically determined
    private boolean getCondition() {
        return false; // Always return false to make the if branch unreachable
    }

    public static void main(String[] args) {
        VariableMaskingExample example = new VariableMaskingExample();
        System.out.println("Result: " + example.showBug(5)); // This will print 5, not the field's value 10
    }
}