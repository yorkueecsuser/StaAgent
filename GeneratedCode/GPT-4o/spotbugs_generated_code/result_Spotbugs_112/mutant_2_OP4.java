class VariableMaskingExample {
    private int value = 10;

    public int showBug(int inputValue) {
        // Local variable 'value' masks the field 'value'
        int value = inputValue; // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
        
        // Introduce an unreachable if-else statement using a dynamic condition
        boolean condition = getCondition(); // Dynamic condition method
        if (condition) {
            System.out.println("Unreachable code block"); // This block is never executed
        } else {
            System.out.println("This is always executed");
        }
        
        return value; // Returns the local variable, not the field
    }

    // Method that returns a static false value, used for unreachable if-else
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        VariableMaskingExample example = new VariableMaskingExample();
        System.out.println("Result: " + example.showBug(5)); // This will print 5, not the field's value 10
    }
}