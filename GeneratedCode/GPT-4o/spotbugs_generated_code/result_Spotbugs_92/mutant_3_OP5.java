class SelfComparisonExample {

    public int showBug(int input) {
        int localVar = input;
        if (localVar == localVar) { // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
            int unreachableCondition = getSwitchCondition();
            switch (unreachableCondition) {
                case 1:
                    System.out.println("This will never be printed.");
                    break;
                default:
                    break;
            }
            return 1;
        } else {
            return 0;
        }
    }

    private int getSwitchCondition() {
        return 0; // Ensures the switch statement is unreachable
    }

    public static void main(String[] args) {
        SelfComparisonExample example = new SelfComparisonExample();
        int result = example.showBug(10);
        System.out.println("Result of self comparison: " + result);
    }
}