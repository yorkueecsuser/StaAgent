class SelfComparisonDemo {

    private int value;

    public SelfComparisonDemo(int value) {
        this.value = value;
    }

    public boolean compareValueWithItself() {
        // Introduce an unreachable if-else statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            return false; // This branch is never reached
        } else {
            return this.value == this.value; // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
        }
    }

    private boolean getUnreachableCondition() {
        return false; // Ensures the if condition above is never true
    }

    public boolean showBug() {
        return compareValueWithItself();
    }

    public static void main(String[] args) {
        SelfComparisonDemo demo = new SelfComparisonDemo(5);
        System.out.println("Is value equal to itself? " + demo.showBug());
    }
}