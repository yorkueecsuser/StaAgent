class SelfComparisonBug {

    private int number;

    public SelfComparisonBug(int number) {
        this.number = number;
    }

    public boolean showBug() {
        return number == number; // BUG: SA: Self comparison of field with itself (SA_FIELD_SELF_COMPARISON)

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case will never be executed because condition is always false
                System.out.println("This is an unreachable switch case.");
                break;
            default:
                // Default case will also never be executed due to the same reason
                System.out.println("This is another unreachable switch case.");
                break;
        }
    }

    private boolean getCondition() {
        // This method always returns false, ensuring the switch statement is unreachable
        return false;
    }

    public static void main(String[] args) {
        SelfComparisonBug bugDemo = new SelfComparisonBug(5);
        System.out.println(bugDemo.showBug());
    }
}