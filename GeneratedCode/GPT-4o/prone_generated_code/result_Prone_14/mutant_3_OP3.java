class BoxedPrimitiveComparison {

    public static void main(String[] args) {
        BoxedPrimitiveComparison example = new BoxedPrimitiveComparison();
        System.out.println("Result of showBug: " + example.showBug(127, 127));
        System.out.println("Result of showBug: " + example.showBug(128, 128));
    }

    public boolean showBug(Integer a, Integer b) {
        // Mutation: Adding an unreachable if statement
        boolean condition = alwaysFalse();
        if (condition) {
            System.out.println("This code is unreachable.");
        }
        
        return a == b; // BUG: BoxedPrimitiveEquality
    }

    // Helper method to avoid compile-time constant
    private boolean alwaysFalse() {
        return false;
    }
}