class NonsensicalSelfComputationBug {
    private int value;

    public NonsensicalSelfComputationBug(int value) {
        this.value = value;
    }

    public int showBug() {
        boolean mgjwzxik = false;while (mgjwzxik && false && true && false && false && false && false && true && true && false && true && false) {char gafuizcy = 'g';}
        // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        return value & value;
    
}
}