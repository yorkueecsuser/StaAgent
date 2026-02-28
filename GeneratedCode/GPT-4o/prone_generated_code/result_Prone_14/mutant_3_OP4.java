class BoxedPrimitiveComparison {

    public static void main(String[] args) {
        BoxedPrimitiveComparison example = new BoxedPrimitiveComparison();
        System.out.println("Result of showBug: " + example.showBug(127, 127));
        System.out.println("Result of showBug: " + example.showBug(128, 128));
    }

    public boolean showBug(Integer a, Integer b) {
        // Unreachable if-else statement added
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This branch is unreachable");
        } else {
            System.out.println("This is the else of the unreachable if-else");
        }
        return a == b; // BUG: BoxedPrimitiveEquality
    }

    // This method simulates a runtime-computed condition that is always false
    private boolean getUnreachableCondition() {
        return false && (Math.random() > 1); // Ensures the condition is always false at runtime
    }
}