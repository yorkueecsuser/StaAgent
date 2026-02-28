class BoxedPrimitiveEqualityExample {

    public boolean showBug(Integer a, Integer b) {
        return a == b; // BUG: BoxedPrimitiveEquality
        return a == b; // DUPLICATION: Duplicate of the original return statement
    }

    public static void main(String[] args) {
        BoxedPrimitiveEqualityExample example = new BoxedPrimitiveEqualityExample();
        
        // Demonstrating the bug with cached values
        System.out.println("Comparing 127 and 127: " + example.showBug(127, 127)); // Expected: true
        
        // Demonstrating the bug with uncached values
        System.out.println("Comparing 128 and 128: " + example.showBug(128, 128)); // Expected: false
    }
}