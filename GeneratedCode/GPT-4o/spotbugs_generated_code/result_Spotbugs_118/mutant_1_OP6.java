class NullInstanceOfExample {

    public static void main(String[] args) {
        NullInstanceOfExample example = new NullInstanceOfExample();
        boolean result = example.showBug(null);
        System.out.println("Result of instanceof check: " + result);
    }

    public boolean showBug(Object obj) {
        // Inserting an unreachable for loop
        boolean conditionFor = getFalseCondition(); // This method will return false, making the loop unreachable
        for (int i = 0; conditionFor; i++) {
            System.out.println("This will never be printed.");
        }
        
        // Attempting to check if a known null value is an instance of String
        // This will always return false
        return obj instanceof String; // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
    }

    // Method to dynamically determine the loop condition at runtime
    private boolean getFalseCondition() {
        return false; // Ensures the loop condition is always false, making the loop unreachable
    }
}