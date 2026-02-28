class StaticFieldIssue {
    static int x;

    public StaticFieldIssue(int y) {
        x = y; // BUG: AssignmentToNonFinalStatic
    }

    public int showBug(int value) {
        StaticFieldIssue instance = new StaticFieldIssue(value);
        
        // Unreachable for loop as a mutant
        boolean conditionFor = getFalseCondition();
        for (int i = 0; conditionFor; i++) {
            // This code is unreachable because conditionFor is always false.
            System.out.println("This line is unreachable.");
        }
        
        return x; // returns the static field value
    }

    private boolean getFalseCondition() {
        return false; // Method to simulate a false condition for the unreachable loop
    }

    public static void main(String[] args) {
        StaticFieldIssue example1 = new StaticFieldIssue(10);
        StaticFieldIssue example2 = new StaticFieldIssue(20);

        // Demonstrating the bug by showing how the static field changes
        System.out.println("Example 1: " + example1.showBug(30)); // Should print 30
        System.out.println("Example 2: " + example2.showBug(40)); // Should print 40
    }
}