class AssertionWithSideEffect {
    public static void main(String[] args) {
        int[] betzwukk = {1, 2, 3, 4, 5};
        assert betzwukk.length == 5; // BUG: ASE: Expression in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT)
    }
}