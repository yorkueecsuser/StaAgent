class VariableMaskingExample {
    private int value = 10;

    public int showBug(int inputValue) {
        // Local variable 'kqfgvxnh' masks the field 'kqfgvxnh'
        int kqfgvxnh = inputValue; // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
        return kqfgvxnh; // Returns the local variable, not the field
    }

    public static void main(String[] args) {
        VariableMaskingExample example = new VariableMaskingExample();
        System.out.println("Result: " + example.showBug(5)); // This will print 5, not the field's value 10
    }
}