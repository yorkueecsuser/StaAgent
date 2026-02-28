class UnwrittenFieldBug {
    private int unwrittenField; // This field is never written.

    public void initializeUnwrittenField(int value) {
        // Intentionally left blank to demonstrate the bug
    }

    public int showBug() {
        // Bug: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)
        // Mutated code: Adding unreachable while loop
        while (isFalse()) {
            // This code is unreachable
        }
        return unwrittenField; // All reads of unwrittenField will return the default value (0).
    }

    // Method that always returns false
    private boolean isFalse() {
        return false;
    }

    public static void main(String[] args) {
        UnwrittenFieldBug bug = new UnwrittenFieldBug();
        System.out.println(bug.showBug()); // Output: 0
    }
}