class SelfComparisonBug {

    private int number;

    public SelfComparisonBug(int number) {
        this.number = number;
    }

    public boolean showBug() {
        return number == number; // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
    }

    public static void main(String[] args) {
        SelfComparisonBug bugDemo = new SelfComparisonBug(5);
        System.out.println(bugDemo.showBug());
    }

    // Mutated code
    private int x;

    public SelfComparisonBug(int x) {
        this.x = x;
    }

    public boolean checkBug() {
        return x == x; // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
    }

    public static void test(String[] a) {
        SelfComparisonBug demo = new SelfComparisonBug(10);
        System.out.println(demo.checkBug());
    }
}