class BoxedPrimitiveComparison {

    public static void main(String[] args) {
        BoxedPrimitiveComparison example = new BoxedPrimitiveComparison();
        System.out.println("Result of showBug: " + example.showBug(127, 127));
        System.out.println("Result of showBug: " + example.showBug(128, 128));
        
        // Inserted unreachable if statement
        boolean condition = determineCondition(); // Using a method to get a condition
        if (condition) {
            System.out.println("This message will never be printed.");
        }
    }

    public boolean showBug(Integer a, Integer b) {
        return a == b; // BUG: BoxedPrimitiveEquality
    }
    
    // Helper method to ensure the condition is always false
    private static boolean determineCondition() {
        return false;
    }
}