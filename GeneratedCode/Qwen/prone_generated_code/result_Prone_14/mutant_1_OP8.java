class BoxedPrimitiveEqualityExample {

    public boolean showBug(Integer a, Integer b) {
        return a == b; // BUG: BoxedPrimitiveEquality
    }

    public boolean showBug(Character x, Character y) {
        return x == y; // Mutant: Renamed 'a' to 'x' and 'b' to 'y'
    }

    public static void main(String[] args) {
        BoxedPrimitiveEqualityExample example = new BoxedPrimitiveEqualityExample();
        
        // Demonstrating the bug with cached values
        System.out.println("Comparing 127 and 127: " + example.showBug(127, 127)); // Expected: true
        
        // Demonstrating the bug with uncached values
        System.out.println("Comparing 128 and 128: " + example.showBug(128, 128)); // Expected: false

        // Demonstrating the mutant with cached values
        System.out.println("Comparing 127 and 127 (mutant): " + example.showBug((char)127, (char)127)); // Expected: true
        
        // Demonstrating the mutant with uncached values
        System.out.println("Comparing 128 and 128 (mutant): " + example.showBug((char)128, (char)128)); // Expected: false
    }
}