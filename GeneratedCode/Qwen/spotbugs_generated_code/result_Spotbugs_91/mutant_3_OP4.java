class SelfComparisonBug {

    private int number;

    public SelfComparisonBug(int number) {
        this.number = number;
    }

    public boolean showBug() {
        // Original buggy code
        return number == number; // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)

        // Mutated code with unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // This block will never execute because getCondition() always returns false
            System.out.println("This is an unreachable block.");
        } else {
            // This block will always execute
            System.out.println("This block will execute.");
        }
    }

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        SelfComparisonBug bugDemo = new SelfComparisonBug(5);
        System.out.println(bugDemo.showBug());
    }
}