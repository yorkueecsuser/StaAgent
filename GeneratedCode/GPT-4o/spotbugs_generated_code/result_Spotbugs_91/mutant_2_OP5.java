class SelfComparisonDemo {

    private int value;

    public SelfComparisonDemo(int value) {
        this.value = value;
    }

    public boolean compareValueWithItself() {
        return this.value == this.value; // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
    }

    public boolean showBug() {
        // Inserting an unreachable switch statement
        int unreachableCondition = getUnreachableCondition(); // This method can return any value
        switch (unreachableCondition) {
            case 1:
                System.out.println("This case is unreachable.");
                break;
            case 2:
                System.out.println("This case is also unreachable.");
                break;
            default:
                break;
        }
        return compareValueWithItself();
    }

    private int getUnreachableCondition() {
        return 0; // Always returns 0, making the switch cases unreachable
    }

    public static void main(String[] args) {
        SelfComparisonDemo demo = new SelfComparisonDemo(5);
        System.out.println("Is value equal to itself? " + demo.showBug());
    }
}