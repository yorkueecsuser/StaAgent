class BoxedPrimitiveComparison {

    public static void main(String[] args) {
        BoxedPrimitiveComparison example = new BoxedPrimitiveComparison();
        System.out.println("Result of showBug: " + example.showBug(127, 127));
        System.out.println("Result of showBug: " + example.showBug(128, 128));
    }

    public boolean showBug(Integer a, Integer b) {
        // Inserted unreachable while loop with a dynamic condition
        boolean conditionWhile = getUnreachableCondition();
        while (conditionWhile) {
            // This block is unreachable
            System.out.println("Inside unreachable while loop.");
        }
        return a == b; // BUG: BoxedPrimitiveEquality
    }

    // Method to get the condition for the unreachable loop
    private boolean getUnreachableCondition() {
        return false; // The loop will never execute as the condition is always false
    }
}