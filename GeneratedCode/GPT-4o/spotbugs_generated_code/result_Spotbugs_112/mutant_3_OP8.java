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

    // Mutated code
    public int mutatedShowBug(int inputValue) {
        // Local variable 'value' masks the field 'value'
        int a = inputValue; // Renamed from 'value' to 'a'
        return a; // Returns the local variable, not the field
    }
}