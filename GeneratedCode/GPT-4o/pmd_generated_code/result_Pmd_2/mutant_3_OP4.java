class StaticFieldIssue {
    static int x;

    public StaticFieldIssue(int y) {
        x = y; // BUG: AssignmentToNonFinalStatic
    }

    public int showBug(int value) {
        StaticFieldIssue instance = new StaticFieldIssue(value);

        // Unreachable if-else statement added as a mutation
        boolean condition = getFalseCondition(); // This method always returns false
        if (condition) {
            System.out.println("This code is unreachable.");
        } else {
            System.out.println("Unreachable block demonstrated.");
        }

        return x; // returns the static field value
    }

    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        StaticFieldIssue example1 = new StaticFieldIssue(10);
        StaticFieldIssue example2 = new StaticFieldIssue(20);

        // Demonstrating the bug by showing how the static field changes
        System.out.println("Example 1: " + example1.showBug(30)); // Should print 30
        System.out.println("Example 2: " + example2.showBug(40)); // Should print 40
    }
}