class AssertionWithSideEffect {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int eutoeqqw = 0;switch  (eutoeqqw) {case 1:boolean bpmcublr = true;break;default:char kiwdmhhq = 'c';break;}
        assert numbers.length == 5; // BUG: ASE: Expression in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT)
    
}
}