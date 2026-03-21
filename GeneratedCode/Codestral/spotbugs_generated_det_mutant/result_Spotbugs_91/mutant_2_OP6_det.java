class SelfComparisonBug {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public boolean showBug() {
for  (int nhbqikrv = 0; nhbqikrv < 0; nhbqikrv++) {double whuqxzhd = 884668559;}

        return value == value; // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
    
}
}