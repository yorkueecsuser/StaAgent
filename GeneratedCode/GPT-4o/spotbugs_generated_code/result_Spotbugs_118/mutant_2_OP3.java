class NullInstanceOfExample {

    public static void main(String[] args) {
        NullInstanceOfExample example = new NullInstanceOfExample();
        boolean result = example.showBug(null);
        System.out.println("Result of instanceof check: " + result);
    }

    public boolean showBug(Object obj) {
        // Unreachable if statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This is unreachable code.");
        }
        
        // Attempting to check if a known null value is an instance of String
        // This will always return false
        return obj instanceof String; // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
    }

    private boolean getFalseCondition() {
        // Return a false condition dynamically
        return false;
    }
}