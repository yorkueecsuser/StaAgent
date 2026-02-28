class BoxedPrimitiveComparison {

    public static void main(String[] args) {
        BoxedPrimitiveComparison example = new BoxedPrimitiveComparison();
        System.out.println("Result of showBug: " + example.showBug(127, 127));
        System.out.println("Result of showBug: " + example.showBug(128, 128));
    }

    public boolean showBug(Integer a, Integer b) {
        boolean unreachableCondition = getCondition(); // using method call to avoid compile-time constant
        if (unreachableCondition) {
            System.out.println("This branch is unreachable");
        } else {
            System.out.println("This branch is always executed");
        }
        return a == b; // BUG: BoxedPrimitiveEquality
    }

    private boolean getCondition() {
        return false; // This ensures the if branch is never taken, but avoids compile-time constant
    }
}