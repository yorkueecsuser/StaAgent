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

// Mutant with renamed variable
class StaticFieldIssueMutant {
    static int a; // Renamed from 'x' to 'a'

    public StaticFieldIssueMutant(int b) { // Renamed from 'y' to 'b'
        a = b; // Updated assignment with renamed variables
    }

    public int showBug(int c) { // Renamed from 'value' to 'c'
        StaticFieldIssueMutant d = new StaticFieldIssueMutant(c); // Renamed from 'instance' to 'd'
        return a; // returns the static field value
    }

    public static void main(String[] args) {
        StaticFieldIssueMutant e = new StaticFieldIssueMutant(10); // Renamed from 'example1' to 'e'
        StaticFieldIssueMutant f = new StaticFieldIssueMutant(20); // Renamed from 'example2' to 'f'

        // Demonstrating the bug by showing how the static field changes
        System.out.println("Example 1: " + e.showBug(30)); // Should print 30
        System.out.println("Example 2: " + f.showBug(40)); // Should print 40
    }
}