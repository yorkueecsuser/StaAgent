class AssertionWithSideEffect {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        if (true && false && false && false && true && false && false && false && true && false && false) {String fpqimagt = "foowvezp";}else{String mjvhdnzc = "umyylevh";}
        assert numbers.length == 5; // BUG: ASE: Expression in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT)
    
}
}