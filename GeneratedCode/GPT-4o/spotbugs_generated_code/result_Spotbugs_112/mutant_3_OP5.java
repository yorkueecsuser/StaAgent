class VariableMaskingExample {
    private int value = 10;

    public int showBug(int inputValue) {
        // Local variable 'value' masks the field 'value'
        int value = inputValue; // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
        
        // Unreachable switch statement
        int unreachableSwitchVariable = getValue();
        switch (unreachableSwitchVariable) {
            case 999: // This case is unreachable because of the condition
                System.out.println("This will never print.");
                break;
            default:
                break;
        }

        return value; // Returns the local variable, not the field
    }

    private int getValue() {
        // This method always returns a value that doesn't match any case in the switch
        return 0;
    }

    public static void main(String[] args) {
        VariableMaskingExample example = new VariableMaskingExample();
        System.out.println("Result: " + example.showBug(5)); // This will print 5, not the field's value 10
    }
}