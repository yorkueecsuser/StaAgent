class StaticFieldIssue {
    static int x;

    public StaticFieldIssue(int y) {
        x = y; // BUG: AssignmentToNonFinalStatic
    }

    public int showBug(int value) {
        StaticFieldIssue instance = new StaticFieldIssue(value);
        return x; // returns the static field value
    }

    public static void main(String[] args) {
        StaticFieldIssue example1 = new StaticFieldIssue(10);
        StaticFieldIssue example2 = new StaticFieldIssue(20);

        // Demonstrating the bug by showing how the static field changes
        System.out.println("Example 1: " + example1.showBug(30)); // Should print 30
        System.out.println("Example 2: " + example2.showBug(40)); // Should print 40
    }
}

// Mutant code with renaming of a variable
class StaticFieldIssueMutant {
    static int a; // Renamed from 'x' to 'a'

    public StaticFieldIssueMutant(int b) { // Renamed from 'y' to 'b'
        a = b; // Mutant assignment to renamed static field
    }

    public int showBugMutant(int c) { // Renamed from 'value' to 'c'
        StaticFieldIssueMutant instance = new StaticFieldIssueMutant(c);
        return a; // returns the renamed static field value
    }

    public static void main(String[] args) {
        StaticFieldIssueMutant example1 = new StaticFieldIssueMutant(10);
        StaticFieldIssueMutant example2 = new StaticFieldIssueMutant(20);

        // Demonstrating the bug by showing how the static field changes
        System.out.println("Example 1 Mutant: " + example1.showBugMutant(30)); // Should print 30
        System.out.println("Example 2 Mutant: " + example2.showBugMutant(40)); // Should print 40
    }
}