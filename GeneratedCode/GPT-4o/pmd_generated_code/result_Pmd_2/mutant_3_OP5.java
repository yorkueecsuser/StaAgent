class StaticFieldIssue {
    static int x;

    public StaticFieldIssue(int y) {
        x = y; // BUG: AssignmentToNonFinalStatic
    }

    public int showBug(int value) {
        StaticFieldIssue instance = new StaticFieldIssue(value);

        // Inserting unreachable switch statement as a mutation
        int unreachableSwitch = getUnreachableValue();
        switch (unreachableSwitch) {
            case 1:
                System.out.println("This is unreachable");
                break;
            default:
                break; // Default case does nothing
        }

        return x; // returns the static field value
    }

    private int getUnreachableValue() {
        return 0; // This always returns 0, making the switch statement unreachable
    }

    public static void main(String[] args) {
        StaticFieldIssue example1 = new StaticFieldIssue(10);
        StaticFieldIssue example2 = new StaticFieldIssue(20);

        // Demonstrating the bug by showing how the static field changes
        System.out.println("Example 1: " + example1.showBug(30)); // Should print 30
        System.out.println("Example 2: " + example2.showBug(40)); // Should print 40
    }
}