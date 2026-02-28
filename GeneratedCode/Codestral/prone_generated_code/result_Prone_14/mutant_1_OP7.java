class BoxedPrimitiveEqualityBug {
    public Integer showBug(Integer a, Integer b) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) { // Unreachable while loop
            conditionWhile = false; // Make it unreachable
        }

        if (a == b) { // BUG: BoxedPrimitiveEquality
            return 1;
        } else {
            return 0;
        }
    }

    private boolean getCondition() {
        return false; // Method to return false for making the while loop unreachable
    }

    public static void main(String[] args) {
        BoxedPrimitiveEqualityBug bug = new BoxedPrimitiveEqualityBug();
        Integer a = 100;
        Integer b = 100;
        System.out.println(bug.showBug(a, b)); // This will print 0, but should print 1
    }
}