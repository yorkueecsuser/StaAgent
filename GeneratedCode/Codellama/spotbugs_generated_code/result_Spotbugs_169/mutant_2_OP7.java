class AssertionWithSideEffect {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        boolean condition = getCondition();
        while (condition) {
            // do nothing
        }
        assert numbers.length == 5; // BUG: ASE: Expression in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT)
    }

    private static boolean getCondition() {
        return false;
    }
}