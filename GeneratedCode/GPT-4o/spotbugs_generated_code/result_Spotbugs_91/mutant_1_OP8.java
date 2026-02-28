class SelfComparisonDemo {

    private int a; // Renamed from 'value'

    public SelfComparisonDemo(int a) {
        this.a = a;
    }

    public boolean compareValueWithItself() {
        return this.a == this.a; // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
    }

    public boolean showBug() {
        return compareValueWithItself();
    }

    public static void main(String[] args) {
        SelfComparisonDemo b = new SelfComparisonDemo(5); // Renamed from 'demo'
        System.out.println("Is value equal to itself? " + b.showBug());
    }
}