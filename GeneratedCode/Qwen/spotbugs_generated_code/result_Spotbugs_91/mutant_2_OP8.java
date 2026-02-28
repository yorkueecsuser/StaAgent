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
    private int a;

    public SelfComparisonBug(int a) {
        this.a = a;
    }

    public boolean b() {
        return a == a; // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
    }

    public static void c(String[] d) {
        SelfComparisonBug e = new SelfComparisonBug(5);
        System.out.println(e.b());
    }
}