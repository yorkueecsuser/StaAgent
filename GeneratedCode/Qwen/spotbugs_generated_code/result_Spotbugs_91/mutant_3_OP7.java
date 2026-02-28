class SelfComparisonBug {

    private int number;

    public SelfComparisonBug(int number) {
        this.number = number;
    }

    public boolean showBug() {
        // Introduced an unreachable while loop with a dynamic condition
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code block
            System.out.println("This is an unreachable loop");
        }

        return number == number; // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
    }

    // Method to provide a dynamic condition for the while loop
    private boolean getCondition() {
        return false; // This ensures the loop is unreachable
    }

    public static void main(String[] args) {
        SelfComparisonBug bugDemo = new SelfComparisonBug(5);
        System.out.println(bugDemo.showBug());
    }
}