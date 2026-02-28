class SelfComparisonBug {

    private int number;

    public SelfComparisonBug(int number) {
        this.number = number;
    }

    public boolean showBug() {
        // Original buggy code
        return number == number; // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)

        // Inserted unreachable if statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This is an unreachable statement");
        }
    }

    private boolean getUnreachableCondition() {
        return false; // This method always returns false, ensuring the if block is unreachable
    }

    public static void main(String[] args) {
        SelfComparisonBug bugDemo = new SelfComparisonBug(5);
        System.out.println(bugDemo.showBug());
    }
}