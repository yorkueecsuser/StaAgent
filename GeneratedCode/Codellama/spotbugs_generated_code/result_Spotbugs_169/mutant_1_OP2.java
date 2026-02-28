class AssertionWithSideEffect {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        assert numbers.length == 5; // BUG: ASE: Expression in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT)
    }

    // Mutant 1: Duplicate assignment statement
    int[] numbers = {1, 2, 3, 4, 5};
    int[] numbers = {1, 2, 3, 4, 5};
    assert numbers.length == 5; // BUG: ASE: Expression in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT)

    // Mutant 2: Duplicate assignment statement
    int[] numbers = {1, 2, 3, 4, 5};
    int[] numbers = {1, 2, 3, 4, 5};
    int[] numbers = {1, 2, 3, 4, 5};
    assert numbers.length == 5; // BUG: ASE: Expression in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT)
}