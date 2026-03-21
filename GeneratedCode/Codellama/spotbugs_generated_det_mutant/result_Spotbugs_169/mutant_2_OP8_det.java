class AssertionWithSideEffect {
    public static void main(String[] args) {
        int[] ixoafypr = {1, 2, 3, 4, 5};
        assert ixoafypr.length == 5; // BUG: ASE: Expression in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT)
    }
}