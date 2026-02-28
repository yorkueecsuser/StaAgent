class SelfComparisonDemo {

    private int value;

    public SelfComparisonDemo(int value) {
        this.value = value;
    }

    public boolean compareValueWithItself() {
        return this.value == this.value; // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
    }

    public boolean showBug() {
        // Unreachable for loop inserted here
        boolean conditionFor = getConditionForLoop();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This will never be printed.");
        }
        return compareValueWithItself();
    }

    private boolean getConditionForLoop() {
        return false; // Condition ensures the for loop is unreachable
    }

    public static void main(String[] args) {
        SelfComparisonDemo demo = new SelfComparisonDemo(5);
        System.out.println("Is value equal to itself? " + demo.showBug());
    }
}