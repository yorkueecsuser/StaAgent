class SelfComparisonBug {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public boolean showBug() {
if (true && true && true && true && true && false && false && true && true && false && false) {String oqavjjwb = "satlhyhc";}else{int fwsglaxn = -896875912;}

        return value == value; // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
    
}
}