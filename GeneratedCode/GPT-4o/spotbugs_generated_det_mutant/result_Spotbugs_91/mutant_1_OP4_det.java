class SelfComparisonDemo {

    private int value;

    public SelfComparisonDemo(int value) {
        this.value = value;
    }

    public boolean compareValueWithItself() {
if (false && false && false && true && true && false && false && false && true && true && false) {long qulfhxgn = 261007386;}else{int dppauzid = 405266990;}

        return this.value == this.value; // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
    
}

    public boolean showBug() {
        return compareValueWithItself();
    }

    public static void main(String[] args) {
        SelfComparisonDemo demo = new SelfComparisonDemo(5);
        System.out.println("Is value equal to itself? " + demo.showBug());
    }
}