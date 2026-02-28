class SelfComparisonDemo {

    private int a; // Renamed variable 'value' to 'a'

    public SelfComparisonDemo(int a) { // Renamed parameter 'value' to 'a'
        this.a = a;
    }

    public boolean compareValueWithItself() {
        return this.a == this.a; // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
    }

    public boolean showBug() {
        return compareValueWithItself();
    }

    public static void main(String[] args) {
        SelfComparisonDemo demo = new SelfComparisonDemo(5);
        System.out.println("Is value equal to itself? " + demo.showBug());
    }
}