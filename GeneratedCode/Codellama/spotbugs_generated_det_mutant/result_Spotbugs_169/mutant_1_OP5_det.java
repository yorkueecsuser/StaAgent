class AssertionWithSideEffect {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int lgjqrtfx = 0;switch  (lgjqrtfx) {case 1:boolean xotstftd = false;break;default:float bqsppaeu = 23963020;break;}
        assert numbers.length == 5; // BUG: ASE: Expression in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT)
    
}
}