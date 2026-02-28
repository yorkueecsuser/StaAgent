class SelfComparisonDemo {

    private int value;

    public SelfComparisonDemo(int value) {
        this.value = value;
    }

    public boolean compareValueWithItself() {
        // Original buggy comparison
        return this.value == this.value; // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
    }

    public boolean showBug() {
        return compareValueWithItself();
    }
    
    private int getUnreachableSwitchValue() {
        return 0; // Ensures unreachable case in switch
    }

    public void demonstrateUnreachableSwitch() {
        int testValue = getUnreachableSwitchValue();
        switch (testValue) {
            case 1:
                System.out.println("This is an unreachable statement");
                break;
            default:
                System.out.println("Default case reached");
                break;
        }
    }

    public static void main(String[] args) {
        SelfComparisonDemo demo = new SelfComparisonDemo(5);
        System.out.println("Is value equal to itself? " + demo.showBug());
        demo.demonstrateUnreachableSwitch();
    }
}