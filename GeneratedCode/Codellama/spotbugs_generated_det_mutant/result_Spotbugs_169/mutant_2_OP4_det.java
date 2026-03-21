class AssertionWithSideEffect {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        if (false && true && true && false && false && false && false && false && false && false && false) {int thhxwsnc = 960006687;}else{float naghxpyw = -445464011;}
        assert numbers.length == 5; // BUG: ASE: Expression in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT)
    
}
}