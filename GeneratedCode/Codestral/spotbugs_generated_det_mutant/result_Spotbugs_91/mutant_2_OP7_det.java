class SelfComparisonBug {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public boolean showBug() {
boolean scmehlfq = false;while (scmehlfq && true && false && true && false && true && false && true && false && true && true && false) {long ixmdvgfv = -500283131;}

        return value == value; // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
    
}
}