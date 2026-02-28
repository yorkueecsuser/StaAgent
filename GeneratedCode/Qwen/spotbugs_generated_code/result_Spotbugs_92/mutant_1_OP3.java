class SelfComparisonBug {

    public boolean showBug(int value) {
        // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON) 
        return value == value;

        // Mutant: Inserting an unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is an unreachable statement");
        }
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime
    }

    public static void main(String[] args) {
        SelfComparisonBug bugDemo = new SelfComparisonBug();
        System.out.println(bugDemo.showBug(5)); // This will always print true due to the bug
    }
}