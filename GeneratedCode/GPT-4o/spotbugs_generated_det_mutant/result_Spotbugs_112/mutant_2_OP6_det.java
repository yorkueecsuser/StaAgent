class VariableMaskingExample {
    private int value = 10;

    public int showBug(int inputValue) {
        // Local variable 'value' masks the field 'value'
        for  (int euvkhxyq = 0; euvkhxyq < 0; euvkhxyq++) {long fmqqymsk = -172910540;}
        int value = inputValue; // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
        return value; // Returns the local variable, not the field
    
}

    public static void main(String[] args) {
        VariableMaskingExample example = new VariableMaskingExample();
        System.out.println("Result: " + example.showBug(5)); // This will print 5, not the field's value 10
    }
}