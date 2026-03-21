class AssertionWithSideEffect {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        if (true && false && true && true && false && false && false && true && false && true && false) {String qxsbgnmz = "oaiebnsw";}else{boolean oysrqstc = true;}
        assert numbers.length == 5; // BUG: ASE: Expression in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT)
    
}
}