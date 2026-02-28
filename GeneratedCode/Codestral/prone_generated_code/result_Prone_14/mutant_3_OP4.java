class BoxedPrimitiveEqualityBug {
    private boolean getUnreachableCondition() {
        // This method always returns false to make the if-else branch unreachable.
        return false;
    }

    public Integer showBug(Integer a, Integer b) {
        if (a == b) { // BUG: BoxedPrimitiveEquality
            return 1;
        } else {
            return 0;
        }

        // Adding unreachable if-else branch
        if (getUnreachableCondition()) {
            System.out.println("This branch is unreachable");
        } else {
            System.out.println("This else branch is also unreachable");
        }
    }

    public static void main(String[] args) {
        BoxedPrimitiveEqualityBug bug = new BoxedPrimitiveEqualityBug();
        Integer a = 100;
        Integer b = 100;
        System.out.println(bug.showBug(a, b)); // This will print 0, but should print 1
    }
}