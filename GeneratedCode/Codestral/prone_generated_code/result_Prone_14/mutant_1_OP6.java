class BoxedPrimitiveEqualityBug {
    public Integer showBug(Integer a, Integer b) {
        boolean unreachableCondition = getUnreachableCondition(); // Added for Mutation
        for (int i = 0; unreachableCondition; i++) { // Unreachable for loop
            System.out.println("This line will never be executed");
        }
        if (a == b) { // BUG: BoxedPrimitiveEquality
            return 1;
        } else {
            return 0;
        }
    }

    private boolean getUnreachableCondition() {
        return false; // Always false to make the loop unreachable
    }

    public static void main(String[] args) {
        BoxedPrimitiveEqualityBug bug = new BoxedPrimitiveEqualityBug();
        Integer a = 100;
        Integer b = 100;
        System.out.println(bug.showBug(a, b)); // This will print 0, but should print 1
    }
}