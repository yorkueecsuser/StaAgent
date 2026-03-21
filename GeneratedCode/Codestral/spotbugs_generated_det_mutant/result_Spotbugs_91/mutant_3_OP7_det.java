class SelfComparisonBug {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public boolean showBug() {
boolean nrurigge = false;while (nrurigge && false && true && true && true && false && true && true && true && false && true && false) {double kminrpft = -797658146;}

        return value == value; // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
    
}
}