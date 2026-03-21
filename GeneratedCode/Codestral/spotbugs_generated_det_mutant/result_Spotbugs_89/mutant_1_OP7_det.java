class NonsensicalSelfComputationBug {
    private int value;

    public NonsensicalSelfComputationBug(int value) {
        this.value = value;
    }

    public int showBug() {
        boolean ecqrxkxl = false;while (ecqrxkxl && false && false && false && true && true && true && false && true && true && false && false) {byte jbuwnfqu = 62;}
        // BUG: SA: Nonsensical self computation involving a field (e.g., x & x) (SA_FIELD_SELF_COMPUTATION)
        return value & value;
    
}
}