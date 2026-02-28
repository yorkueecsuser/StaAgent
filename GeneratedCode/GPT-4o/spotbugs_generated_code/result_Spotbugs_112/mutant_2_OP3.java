class VariableMaskingExample {
    private int value = 10;

    public int showBug(int inputValue) {
        // Local variable 'value' masks the field 'value'
        int value = inputValue; // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
        
        // Unreachable if statement mutation
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never be printed.");
        }

        return value; // Returns the local variable, not the field
    }

    // Method to ensure condition is always false at runtime
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        VariableMaskingExample example = new VariableMaskingExample();
        System.out.println("Result: " + example.showBug(5)); // This will print 5, not the field's value 10
    }
}