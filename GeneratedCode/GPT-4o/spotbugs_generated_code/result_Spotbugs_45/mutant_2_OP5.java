class NullFieldExample {
    
    private String alwaysNull; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)

    public NullFieldExample() {
        alwaysNull = null; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)
        
        // Mutant code: Unreachable switch statement
        int value = getUnreachableValue(); // This method always returns a value that doesn't match any case.
        switch (value) {
            case 1:
                System.out.println("This case is never reached.");
                break;
            case 2:
                System.out.println("Neither is this one.");
                break;
            default:
                System.out.println("Default case, but still unreachable due to condition.");
                break;
        }
    }
    
    private int getUnreachableValue() {
        return 3; // Ensure this returns a value not covered by any cases in the switch
    }

    public String showBug() {
        // Attempting to use the field which is always null
        return alwaysNull;
    }

    public static void main(String[] args) {
        NullFieldExample example = new NullFieldExample();
        System.out.println("The value of alwaysNull is: " + example.showBug());
    }
}