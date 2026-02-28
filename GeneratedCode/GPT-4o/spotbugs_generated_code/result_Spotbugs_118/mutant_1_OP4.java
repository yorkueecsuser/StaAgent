class NullInstanceOfExample {

    public static void main(String[] args) {
        NullInstanceOfExample example = new NullInstanceOfExample();
        boolean result = example.showBug(null);
        System.out.println("Result of instanceof check: " + result);
    }

    public boolean showBug(Object obj) {
        // Unreachable if-else branch added
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This should never be printed.");
        } else {
            System.out.println("This is the reachable branch in the mutated code.");
        }
        // Attempting to check if a known null value is an instance of String
        // This will always return false
        return obj instanceof String; // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
    }
    
    // Method to simulate a runtime-evaluated condition that always returns false
    private boolean getFalseCondition() {
        return false;
    }
}