class BoxedPrimitiveComparison {

    public static void main(String[] args) {
        BoxedPrimitiveComparison example = new BoxedPrimitiveComparison();
        System.out.println("Result of showBug: " + example.showBug(127, 127));
        System.out.println("Result of showBug: " + example.showBug(128, 128));

        // Mutant code
        BoxedPrimitiveComparison e = new BoxedPrimitiveComparison();
        System.out.println("Result of showBugMutant: " + e.showBugMutant(127, 127));
        System.out.println("Result of showBugMutant: " + e.showBugMutant(128, 128));
    }

    public boolean showBug(Integer a, Integer b) {
        return a == b; // BUG: BoxedPrimitiveEquality
    }

    // Mutant method with renamed variables
    public boolean showBugMutant(Integer x, Integer y) {
        return x == y;
    }
}