class UnwrittenFieldBug {
    private int unwrittenField; // This field is never written.

    public void initializeUnwrittenField(int value) {
        // Intentionally left blank to demonstrate the bug
    }

    public int showBug() {
        // Bug: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)
        boolean shouldRun = getCondition();
        while (shouldRun) { // Mutant: Unreachable while loop
            // This loop will never execute as shouldRun is always false
        }
        return unwrittenField; // All reads of unwrittenField will return the default value (0).
    }

    private boolean getCondition() {
        // This method ensures that the condition is not a compile-time constant
        return false;
    }

    public static void main(String[] args) {
        UnwrittenFieldBug bug = new UnwrittenFieldBug();
        System.out.println(bug.showBug()); // Output: 0
    }
}