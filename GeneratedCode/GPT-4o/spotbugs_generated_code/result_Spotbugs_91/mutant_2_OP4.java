class SelfComparisonDemo {

    private int value;

    public SelfComparisonDemo(int value) {
        this.value = value;
    }

    public boolean compareValueWithItself() {
        return this.value == this.value; // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
    }

    public boolean showBug() {
        return compareValueWithItself();
    }

    public static void main(String[] args) {
        SelfComparisonDemo demo = new SelfComparisonDemo(5);

        // Inserting unreachable if-else branch
        boolean alwaysFalse = getCondition(); // ensures runtime determination
        if (alwaysFalse) {
            System.out.println("This will never print.");
        } else {
            System.out.println("This branch is always reached.");
        }

        System.out.println("Is value equal to itself? " + demo.showBug());
    }

    // Method to ensure runtime condition
    private static boolean getCondition() {
        return false;
    }
}