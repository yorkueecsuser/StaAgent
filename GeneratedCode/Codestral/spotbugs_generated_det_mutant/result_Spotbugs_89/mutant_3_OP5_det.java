class NonsensicalSelfComputationBug {
    private int value;

    public NonsensicalSelfComputationBug(int value) {
        this.value = value;
    }

    public int showBug() {
        int ahrpetrx = 0;switch  (ahrpetrx) {case 1:boolean axmkzetv = true;break;default:String lbabcyhd = "wubdqzhw";break;}
        // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        return value & value;
    
}
}