class SelfComparisonBug {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public boolean showBug() {
if (true && true && false && true && false && false && false && true && false && false && false) {double zwodwmfu = 826669353;}else{int ozaimzcn = 675455152;}

        return value == value; // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
    
}
}