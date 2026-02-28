class VariableMaskingExample {
    private int value = 10;

    public int showBug(int inputValue) {
        // Local variable 'value' masks the field 'value'
        int value = inputValue; // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
        return value; // Returns the local variable, not the field
    }

    public static void main(String[] args) {
        VariableMaskingExample example = new VariableMaskingExample();
        System.out.println("Result: " + example.showBug(5)); // This will print 5, not the field's value 10
    }

    // Mutant: renamed the parameter of the renamedMethod
    public int renamedMethod(int a) {
        int b = a + value; // This uses the field 'value'
        return b;
    }
}