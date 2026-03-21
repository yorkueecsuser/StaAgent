class UnwrittenFieldBug {
    private int unwrittenField; // This field is never written.

    public void initializeUnwrittenField(int value) {
        // Intentionally left blank to demonstrate the bug
    }

    public int showBug() {
        boolean shouldRun = false;
        if (shouldRun) {
            // Unreachable if-else branch
            return 1;
        } else {
            // Bug: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)
            return unwrittenField; // All reads of unwrittenField will return the default value (0).
        }
    }

    public static void main(String[] args) {
        UnwrittenFieldBug bug = new UnwrittenFieldBug();
        System.out.println(bug.showBug()); // Output: 0
    }
}