class SelfComparisonBug {

    private int number;

    public SelfComparisonBug(int number) {
        this.number = number;
    }

    public boolean showBug() {
        // Original buggy code
        return number == number; // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)

        // Inserted unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is reachable code.");
        } else {
            System.out.println("This is unreachable code due to the condition always being false.");
        }
    }

    private boolean getCondition() {
        return false; // This method always returns false, making the else block unreachable
    }

    public static void main(String[] args) {
        SelfComparisonBug bugDemo = new SelfComparisonBug(5);
        System.out.println(bugDemo.showBug());
    }
}