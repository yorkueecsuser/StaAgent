class SelfComparisonExample {

    public int showBug(int input) {
        int localVar = input;
        if (localVar == localVar) { // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
            // Unreachable switch statement mutation
            int conditionValue = getUnreachableSwitchValue(); // Ensure this is not a compile-time constant
            switch (conditionValue) {
                case 1:
                    System.out.println("This is unreachable case 1.");
                    break;
                case 2:
                    System.out.println("This is unreachable case 2.");
                    break;
                default:
                    break;
            }
            return 1;
        } else {
            return 0;
        }
    }
    
    private int getUnreachableSwitchValue() {
        return 0; // This ensures the switch cases are unreachable
    }

    public static void main(String[] args) {
        SelfComparisonExample example = new SelfComparisonExample();
        int result = example.showBug(10);
        System.out.println("Result of self comparison: " + result);
    }
}