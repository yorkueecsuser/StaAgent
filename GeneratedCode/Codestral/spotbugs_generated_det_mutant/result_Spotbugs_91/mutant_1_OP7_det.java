class SelfComparisonBug {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public boolean showBug() {
boolean jurdzhpt = false;while (jurdzhpt && false && true && false && true && true && false && true && true && true && true && false) {double pxsuxutb = 446968731;}

        return value == value; // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
    
}
}