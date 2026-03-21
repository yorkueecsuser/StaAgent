class SelfComparisonBug {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public boolean showBug() {
for  (int vgcubsqv = 0; vgcubsqv < 0; vgcubsqv++) {byte dzpbbvnx = 40;}

        return value == value; // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
    
}
}