class BoxedPrimitiveEqualityBug {
    public Integer showBug(Integer a, Integer b) {
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {  // Mutation: Unreachable for loop
            // Unreachable code
        }
        if (a == b) { // BUG: BoxedPrimitiveEquality
            return 1;
        } else {
            return 0;
        }
    }

    public boolean getCondition() {
        return false;  // Always returns false to make the loop unreachable
    }

    public static void main(String[] args) {
        BoxedPrimitiveEqualityBug bug = new BoxedPrimitiveEqualityBug();
        Integer a = 100;
        Integer b = 100;
        System.out.println(bug.showBug(a, b)); // This will print 0, but should print 1
    }
}