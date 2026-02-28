class SelfComparisonExample {

    public int showBug(int input) {
        int localVar = input;
        if (localVar == localVar) { // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
            return 1;
        } else {
            return 0;
        }
    }

    private boolean getFalseCondition() {
        return false; // Method returns a dynamically evaluated false
    }

    public void unreachableIfStatement() {
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This will never be printed");
        }
    }

    public static void main(String[] args) {
        SelfComparisonExample example = new SelfComparisonExample();
        int result = example.showBug(10);
        System.out.println("Result of self comparison: " + result);

        // Calling the method with unreachable if statement
        example.unreachableIfStatement();
    }
}