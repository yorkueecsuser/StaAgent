class SelfComparisonBug {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public boolean showBug() {
int sfpdgsrt = 0;switch  (sfpdgsrt) {case 1:long dpvdumpu = 866530391;break;default:boolean erjidcla = true;break;}

        return value == value; // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
    
}
}