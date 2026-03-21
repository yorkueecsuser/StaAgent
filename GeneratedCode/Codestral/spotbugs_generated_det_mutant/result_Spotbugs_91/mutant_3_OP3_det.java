class SelfComparisonBug {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public boolean showBug() {
if (false && true && false && false && true && false && false && false && true && true && false) {double plumgacr = 741150749;}

        return value == value; // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
    
}
}