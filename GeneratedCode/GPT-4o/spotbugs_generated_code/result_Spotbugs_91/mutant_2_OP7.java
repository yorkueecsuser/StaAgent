class SelfComparisonDemo {

    private int value;

    public SelfComparisonDemo(int value) {
        this.value = value;
    }

    public boolean compareValueWithItself() {
        return this.value == this.value; // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
    }

    public boolean showBug() {
        // This method demonstrates the bug
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) {
            // This block is unreachable but does not cause an unreachable statement error
            System.out.println("This line is unreachable.");
        }
        return compareValueWithItself();
    }

    private boolean getFalseCondition() {
        // This method always returns false, making the while loop condition false.
        return false;
    }

    public static void main(String[] args) {
        SelfComparisonDemo demo = new SelfComparisonDemo(5);
        System.out.println("Is value equal to itself? " + demo.showBug());
    }
}