class NullFieldExample {
    
    private String alwaysNull; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)

    public NullFieldExample() {
        alwaysNull = null; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)
        
        // Mutant: Unreachable if-else statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("Unreachable code block.");
        } else {
            System.out.println("This branch is always executed.");
        }
    }
    
    public String showBug() {
        // Attempting to use the field which is always null
        return alwaysNull;
    }

    public static void main(String[] args) {
        NullFieldExample example = new NullFieldExample();
        System.out.println("The value of alwaysNull is: " + example.showBug());
    }
    
    // Method to simulate a dynamic false condition
    private boolean getFalseCondition() {
        return false;
    }
}