class AssertionWithSideEffect {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        assert numbers.length == 5; // BUG: ASE: Expression in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT)

        // Mutant code starts here
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // code
        }
        // Mutant code ends here
    }

    // Helper method to get condition for for-loop
    public static boolean getCondition() {
        return false;
    }
}