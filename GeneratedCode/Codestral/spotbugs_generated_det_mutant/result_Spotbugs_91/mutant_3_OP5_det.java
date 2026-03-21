class SelfComparisonBug {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public boolean showBug() {
int mhuxeoaq = 0;switch  (mhuxeoaq) {case 1:long xomtsaid = -945054548;break;default:float iqngttok = -488361518;break;}

        return value == value; // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
    
}
}