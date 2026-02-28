class UnwrittenFieldBug {
    private int unwrittenField; // This field is never written.

    public void initializeUnwrittenField(int value) {
        // Intentionally left blank to demonstrate the bug
    }

    public int showBug() {
        // Bug: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)
        return unwrittenField; // All reads of unwrittenField will return the default value (0).
    }

    // Mutated code for Equivalent Loop Replacement
    public void equivalentLoopReplacement() {
        // Replacing a for/while loop with an equivalent do-while loop.
        // However, the original code does not contain any loops.
        // So, no changes are made to this method.
    }

    public static void main(String[] args) {
        UnwrittenFieldBug bug = new UnwrittenFieldBug();
        System.out.println(bug.showBug()); // Output: 0

        // Calling the mutated method for Equivalent Loop Replacement
        bug.equivalentLoopReplacement();
    }
}