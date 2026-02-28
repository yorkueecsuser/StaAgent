class BoxedPrimitiveEqualityExample {

    public boolean showBug(Integer a, Integer b) {
        return a == b; // BUG: BoxedPrimitiveEquality

        // Introduced unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // This block will never execute because getCondition() returns false
            System.out.println("This is an unreachable block.");
        } else {
            // This block also will never execute for the same reason
            System.out.println("This is another unreachable block.");
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the if-else block unreachable
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