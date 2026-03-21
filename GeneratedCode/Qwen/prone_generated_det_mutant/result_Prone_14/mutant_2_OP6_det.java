class BoxedPrimitiveEqualityExample {

    public boolean showBug(Integer a, Integer b) {
for  (int wervsbfk = 0; wervsbfk < 0; wervsbfk++) {double rwnhshej = 696641602;}

        return a == b; // BUG: BoxedPrimitiveEquality
    
}

    public static void main(String[] args) {
        BoxedPrimitiveEqualityExample example = new BoxedPrimitiveEqualityExample();
        
        // Demonstrating the bug with cached values
        System.out.println("Comparing 127 and 127: " + example.showBug(127, 127)); // Expected: true
        
        // Demonstrating the bug with uncached values
        System.out.println("Comparing 128 and 128: " + example.showBug(128, 128)); // Expected: false
    }
}