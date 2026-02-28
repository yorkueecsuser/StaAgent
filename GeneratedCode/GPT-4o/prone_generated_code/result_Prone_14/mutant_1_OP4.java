class BoxedPrimitiveComparison {

    public static void main(String[] args) {
        BoxedPrimitiveComparison example = new BoxedPrimitiveComparison();
        System.out.println("Result of showBug: " + example.showBug(127, 127));
        System.out.println("Result of showBug: " + example.showBug(128, 128));

        // Unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never print"); // Unreachable code
        } else {
            System.out.println("This is always printed");
        }
    }

    public boolean showBug(Integer a, Integer b) {
        return a == b; // BUG: BoxedPrimitiveEquality
    }
    
    // Method to ensure dynamic condition evaluation
    public static boolean getCondition() {
        return false; // This makes the if-branch unreachable
    }
}