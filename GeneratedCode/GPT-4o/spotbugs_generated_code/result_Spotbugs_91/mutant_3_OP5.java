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
    
    // A method to generate a non-final variable for the mutation
    private int getDynamicValue() {
        return 2; // This can be anything that is not a compile-time constant
    }

    public static void main(String[] args) {
        SelfComparisonDemo demo = new SelfComparisonDemo(5);
        System.out.println("Is value equal to itself? " + demo.showBug());

        // Adding an unreachable switch statement mutation
        int dynamicValue = demo.getDynamicValue();
        switch (dynamicValue) {
            case 1: 
                System.out.println("This will never be executed.");
                break;
            default:
                System.out.println("This default case is executed.");
                break;
        }
    }
}