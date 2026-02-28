class SelfComparisonBug {

    private int number;

    public SelfComparisonBug(int number) {
        this.number = number;
    }

    public boolean showBug() {
        // Inserting an unreachable if branch
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            number = number + 1;
        }

        return number == number; // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)
    }

    private boolean getCondition() {
        // This method always returns false, making the if block unreachable
        return false;
    }

    public static void main(String[] args) {
        SelfComparisonBug bugDemo = new SelfComparisonBug(5);
        System.out.println(bugDemo.showBug());
    }
}