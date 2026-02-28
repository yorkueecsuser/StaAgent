class SelfComparisonDemo {

    private int value;

    public SelfComparisonDemo(int value) {
        this.value = value;
    }

    public boolean compareValueWithItself() {
        return this.value == this.value; // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
    }

    public boolean showBug() {
        // Introduce an unreachable if-else branch
        boolean alwaysFalseCondition = getFalseCondition();
        if (alwaysFalseCondition) {
            System.out.println("This will never be printed.");
        } else {
            System.out.println("Unreachable branch was skipped.");
        }

        return compareValueWithItself();
    }

    // Method to get a false condition ensuring it's not a compile-time constant
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        SelfComparisonDemo demo = new SelfComparisonDemo(5);
        System.out.println("Is value equal to itself? " + demo.showBug());
    }
}