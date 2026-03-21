class SelfComparisonBug {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public boolean showBug() {
if (true && true && true && false && false && false && false && false && false && true && false) {boolean mziaomyc = true;}else{long kyupnuom = 249529731;}

        return value == value; // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
    
}
}