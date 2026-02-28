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

    // Mutated code with renaming operator applied to other variables
    private int x;

    public SelfComparisonBug(int x) {
        this.x = x;
    }

    public boolean checkValue() {
        return x == x; // This is a redundant self-comparison, but not the bug we are focusing on
    }

    public static void testMethod(String[] args) {
        SelfComparisonBug demo = new SelfComparisonBug(10);
        System.out.println(demo.checkValue());
    }
}