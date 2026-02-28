class BoxedPrimitiveEqualityExample {

    public boolean showBug(Integer a, Integer b) {
        return a == b; // BUG: BoxedPrimitiveEquality
    }

    public boolean showBug(Integer x, Integer b) { // Mutant with renamed variable 'a' to 'x'
        return x == b;
    }

    public static void main(String[] args) {
        BoxedPrimitiveEqualityExample example = new BoxedPrimitiveEqualityExample();
        
        // Demonstrating the bug with cached values
        System.out.println("Comparing 127 and 127: " + example.showBug(127, 127)); // Expected: true
        
        // Demonstrating the bug with uncached values
        System.out.println("Comparing 128 and 128: " + example.showBug(128, 128)); // Expected: false

        // Demonstrating the mutant with renamed variable
        System.out.println("Comparing 127 and 127 with mutant: " + example.showBug(127, 127)); // Expected: true
        System.out.println("Comparing 128 and 128 with mutant: " + example.showBug(128, 128)); // Expected: false
    }
}