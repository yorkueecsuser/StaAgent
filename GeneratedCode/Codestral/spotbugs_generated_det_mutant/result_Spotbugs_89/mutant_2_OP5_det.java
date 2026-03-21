class NonsensicalSelfComputationBug {
    private int value;

    public NonsensicalSelfComputationBug(int value) {
        this.value = value;
    }

    public int showBug() {
        int oepbgzgl = 0;switch  (oepbgzgl) {case 1:char aeauccvg = 'f';break;default:long nwjwhnfe = 53994040;break;}
        // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        return value & value;
    
}
}