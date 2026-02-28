class NullFieldExample {
    
    private String alwaysNull; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)

    public NullFieldExample() {
        alwaysNull = null; // BUG: UwF: Field only ever set to null (UWF_NULL_FIELD)

        // Unreachable for loop insertion
        boolean conditionFor = getCondition(); // Ensures that the loop condition is not a compile-time constant
        for (int i = 0; conditionFor; i++) {
            System.out.println("This block is unreachable due to a false condition.");
        }
    }
    
    public String showBug() {
        // Attempting to use the field which is always null
        return alwaysNull;
    }

    // Method to provide a false condition
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        NullFieldExample example = new NullFieldExample();
        System.out.println("The value of alwaysNull is: " + example.showBug());
    }
}