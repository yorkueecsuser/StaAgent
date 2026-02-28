class StaticFieldIssue {
    static int x;

    public StaticFieldIssue(int y) {
        x = y; // BUG: AssignmentToNonFinalStatic
    }

    public int showBug(int value) {
        StaticFieldIssue instance = new StaticFieldIssue(value);
        
        // Inserting unreachable for loop
        boolean conditionFor = getConditionForLoop();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This code is unreachable");
        }

        return x; // returns the static field value
    }

    // Helper method to ensure the for loop is unreachable
    private boolean getConditionForLoop() {
        return false; // This will ensure the loop is never entered
    }

    public static void main(String[] args) {
        StaticFieldIssue example1 = new StaticFieldIssue(10);
        StaticFieldIssue example2 = new StaticFieldIssue(20);

        // Demonstrating the bug by showing how the static field changes
        System.out.println("Example 1: " + example1.showBug(30)); // Should print 30
        System.out.println("Example 2: " + example2.showBug(40)); // Should print 40
    }
}