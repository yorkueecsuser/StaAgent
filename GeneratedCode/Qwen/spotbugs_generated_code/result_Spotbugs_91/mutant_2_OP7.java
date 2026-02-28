class SelfComparisonBug {

    private int number;

    public SelfComparisonBug(int number) {
        this.number = number;
    }

    public boolean showBug() {
        // Introduced an unreachable while loop with a dynamic condition
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop will never execute because conditionWhile is always false
        }

        return number == number; // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
    }

    private boolean getCondition() {
        // This method returns false, making the while loop condition always false
        return false;
    }

    public static void main(String[] args) {
        SelfComparisonBug bugDemo = new SelfComparisonBug(5);
        System.out.println(bugDemo.showBug());
    }
}