class SelfComparisonBug {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public boolean showBug() {
int ylvenbjz = 0;switch  (ylvenbjz) {case 1:int miizqnri = -171241896;break;default:byte mbwvnnup = 93;break;}

        return value == value; // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
    
}
}