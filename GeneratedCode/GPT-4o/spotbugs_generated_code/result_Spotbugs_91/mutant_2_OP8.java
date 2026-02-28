class SelfComparisonDemo {

    private int a; // Renamed from 'value' to 'a'

    public SelfComparisonDemo(int a) { // Renamed parameter from 'value' to 'a'
        this.a = a; // Updated assignment to use 'a'
    }

    public boolean compareValueWithItself() {
        return this.a == this.a; // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
    }

    public boolean showBug() {
        return compareValueWithItself();
    }

    public static void main(String[] args) {
        SelfComparisonDemo b = new SelfComparisonDemo(5); // Renamed 'demo' to 'b'
        System.out.println("Is value equal to itself? " + b.showBug());
    }
}