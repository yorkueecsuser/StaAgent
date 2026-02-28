class VariableMaskingExample {
    private int value = 10;

    public int showBug(int inputValue) {
        // Local variable 'value' masks the field 'value'
        int value = inputValue; // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)

        // Introduce a non-final variable for the condition
        boolean condition = getCondition();

        // Unreachable if-else branch due to condition being false
        if (condition) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("This else branch is also unreachable.");
        }

        return value; // Returns the local variable, not the field
    }

    // Helper method to ensure the condition is always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        VariableMaskingExample example = new VariableMaskingExample();
        System.out.println("Result: " + example.showBug(5)); // This will print 5, not the field's value 10
    }
}