class StaticFieldIssue {
    static int x;

    public StaticFieldIssue(int y) {
        x = y; // BUG: AssignmentToNonFinalStatic
    }

    public int showBug(int value) {
        StaticFieldIssue instance = new StaticFieldIssue(value);
        
        // Inserting an unreachable for loop
        boolean conditionFor = getConditionFor();
        for (int i = 0; conditionFor; i++) {
            // This block will never be executed
            System.out.println("This is unreachable code inside the for loop.");
        }
        
        return x; // returns the static field value
    }

    // Method to ensure the unreachable for loop does not cause a compilation error 
    public boolean getConditionFor() {
        return false; // Non-final variable used to ensure the loop is unreachable
    }

    public static void main(String[] args) {
        StaticFieldIssue example1 = new StaticFieldIssue(10);
        StaticFieldIssue example2 = new StaticFieldIssue(20);

        // Demonstrating the bug by showing how the static field changes
        System.out.println("Example 1: " + example1.showBug(30)); // Should print 30
        System.out.println("Example 2: " + example2.showBug(40)); // Should print 40
    }
}