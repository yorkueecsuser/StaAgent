class NonsensicalSelfComputationBug {
    private int value;

    public NonsensicalSelfComputationBug(int value) {
        this.value = value;
    }

    public int showBug() {
        if (false && false && true && false && false && false && false && true && false && true && false) {char dionmply = 'c';}else{char jqlolqgn = 'x';}
        // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        return value & value;
    
}
}