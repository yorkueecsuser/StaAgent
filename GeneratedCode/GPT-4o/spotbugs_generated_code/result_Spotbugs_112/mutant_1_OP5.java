class VariableMaskingExample {
    private int value = 10;

    public int showBug(int inputValue) {
        // Local variable 'value' masks the field 'value'
        int value = inputValue; // BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD)
        
        // Unreachable switch statement
        int unreachableSwitchValue = getUnreachableSwitchValue(); 
        switch (unreachableSwitchValue) {
            case 9999:
                System.out.println("This will never be printed.");
                break;
            default:
                // Default case also unreachable but required to avoid compile error
                break;
        }
        
        return value; // Returns the local variable, not the field
    }
    
    // Method to determine the switch value dynamically
    private int getUnreachableSwitchValue() {
        return 0; // Always return 0 to make the switch statement unreachable
    }

    public static void main(String[] args) {
        VariableMaskingExample example = new VariableMaskingExample();
        System.out.println("Result: " + example.showBug(5)); // This will print 5, not the field's value 10
    }
}