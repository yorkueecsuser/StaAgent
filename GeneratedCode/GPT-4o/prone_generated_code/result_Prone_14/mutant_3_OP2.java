class BoxedPrimitiveComparison {

    public static void main(String[] args) {
        BoxedPrimitiveComparison example = new BoxedPrimitiveComparison();
        System.out.println("Result of showBug: " + example.showBug(127, 127));
        System.out.println("Result of showBug: " + example.showBug(128, 128));
    }

    public boolean showBug(Integer a, Integer b) {
        return a == b; // BUG: BoxedPrimitiveEquality
    }

    // Mutant: Duplicating an assignment statement
    public int duplicateAssignmentExample() {
        int x = 5;
        int y = 10;
        x = y; // Original assignment
        x = y; // Duplicated assignment
        return x;
    }
}