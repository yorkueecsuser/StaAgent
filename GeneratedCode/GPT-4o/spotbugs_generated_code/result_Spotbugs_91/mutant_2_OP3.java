class SelfComparisonDemo {

    private int value;

    public SelfComparisonDemo(int value) {
        this.value = value;
    }

    public boolean compareValueWithItself() {
        return this.value == this.value; // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
    }

    public boolean showBug() {
        return compareValueWithItself();
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        SelfComparisonDemo demo = new SelfComparisonDemo(5);
        System.out.println("Is value equal to itself? " + demo.showBug());

        // Mutant code: Unreachable if statement
        SelfComparisonDemo demo2 = new SelfComparisonDemo(10);
        if (demo2.getUnreachableCondition()) {
            System.out.println("This is an unreachable branch.");
        }
    }
}