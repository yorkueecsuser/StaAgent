class AssertionWithSideEffect {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int vgwfzttq = 0;switch  (vgwfzttq) {case 1:byte ioefkbjb = -11;break;default:String zbhndewn = "xjjdozih";break;}
        assert numbers.length == 5; // BUG: ASE: Expression in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT)
    
}
}