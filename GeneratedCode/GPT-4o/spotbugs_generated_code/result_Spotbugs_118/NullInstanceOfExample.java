class NullInstanceOfExample {

    public static void main(String[] args) {
        NullInstanceOfExample example = new NullInstanceOfExample();
        boolean result = example.showBug(null);
        System.out.println("Result of instanceof check: " + result);
    }

    public boolean showBug(Object obj) {
        // Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This block is unreachable
            System.out.println("This is unreachable code in the while loop.");
        }

        // Attempting to check if a known null value is an instance of String
        // This will always return false
        return obj instanceof String; // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
    }

    // Method to ensure the condition is determined at runtime
    private boolean getCondition() {
        return false; // This makes the while loop condition always false
    }
}