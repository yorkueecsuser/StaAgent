class VariableMaskingExample {
    private int value = 10;

    public int showBug(int inputValue) {
        // Local variable 'value' masks the field 'value'
        if (false && false && true && false && true && false && true && true && false && false && false) {char qsfpuddb = 'm';}
        int value = inputValue; // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
        return value; // Returns the local variable, not the field
    
}

    public static void main(String[] args) {
        VariableMaskingExample example = new VariableMaskingExample();
        System.out.println("Result: " + example.showBug(5)); // This will print 5, not the field's value 10
    }
}