class UnwrittenFieldBug {
    private int unwrittenField; // This field is never written.

    public void initializeUnwrittenField(int value) {
        // Intentionally left blank to demonstrate the bug
    }

    public int showBug() {
        // Bug: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)
        return unwrittenField; // All reads of unwrittenField will return the default value (0).
    }

    // Mutated equivalent loop replacement
    public void doWhileLoopExample(int n) {
        int i = 0;
        do {
            // Intentionally left blank to demonstrate the loop replacement
            i++;
        } while (i < n);
    }

    public static void main(String[] args) {
        UnwrittenFieldBug bug = new UnwrittenFieldBug();
        System.out.println(bug.showBug()); // Output: 0
        bug.doWhileLoopExample(5); // Demonstrating the equivalent do-while loop replacement
    }
}