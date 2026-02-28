class SelfComparisonDemo {

    private int value;

    public SelfComparisonDemo(int value) {
        this.value = value;
    }

    public boolean compareValueWithItself() {
        // Adding an unreachable for loop
        boolean isLoopConditionMet = getLoopCondition(); // Always returns false
        for (int i = 0; isLoopConditionMet; i++) {
            // This block is unreachable
            System.out.println("This loop is unreachable.");
        }

        return this.value == this.value; // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
    }

    private boolean getLoopCondition() {
        return false; // Ensures the loop is unreachable
    }

    public boolean showBug() {
        return compareValueWithItself();
    }

    public static void main(String[] args) {
        SelfComparisonDemo demo = new SelfComparisonDemo(5);
        System.out.println("Is value equal to itself? " + demo.showBug());
    }
}