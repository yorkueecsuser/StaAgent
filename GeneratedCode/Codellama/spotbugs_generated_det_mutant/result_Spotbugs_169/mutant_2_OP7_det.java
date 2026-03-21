class AssertionWithSideEffect {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        boolean nwuenvez = false;while (nwuenvez && true && true && true && true && false && false && false && true && true && false && false) {float evgjirgj = -317191501;}
        assert numbers.length == 5; // BUG: ASE: Expression in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT)
    
}
}