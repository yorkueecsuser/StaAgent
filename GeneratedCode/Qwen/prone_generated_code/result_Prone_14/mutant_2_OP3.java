class BoxedPrimitiveEqualityExample {

    public boolean showBug(Integer a, Integer b) {
        return a == b; // BUG: BoxedPrimitiveEquality

        // Inserting an unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable statement.");
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the if block unreachable
        return false;
    }

    public static void main(String[] args) {
        BoxedPrimitiveEqualityExample example = new BoxedPrimitiveEqualityExample();
        
        // Demonstrating the bug with cached values
        System.out.println("Comparing 127 and 127: " + example.showBug(127, 127)); // Expected: true
        
        // Demonstrating the bug with uncached values
        System.out.println("Comparing 128 and 128: " + example.showBug(128, 128)); // Expected: false
    }
}