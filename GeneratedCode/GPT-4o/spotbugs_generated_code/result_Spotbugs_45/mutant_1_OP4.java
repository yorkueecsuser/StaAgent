class NullFieldExample {
    
    private String alwaysNull; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)

    public NullFieldExample() {
        alwaysNull = null; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)
        
        // Introduce an unreachable if-else statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This block will never be executed.");
        } else {
            System.out.println("This block is always executed.");
        }
    }
    
    private boolean getFalseCondition() {
        return false; // This method is used to simulate a dynamic condition
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