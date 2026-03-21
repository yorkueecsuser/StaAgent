class UnwrittenFieldBug {
    private int unwrittenField; // This field is never written.

    public void initializeUnwrittenField(int value) {
        // Intentionally left blank to demonstrate the bug
    }

    public int showBug() {
        // Bug: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable if-else statement mutation
            // The following code is unreachable since the condition is always false
            int x = 10;
            x++;
        } else {
            // Alternative code that will not be executed
            int y = 20;
            y--;
        }
        return unwrittenField; // All reads of unwrittenField will return the default value (0).
    }

    // Method to simulate a dynamically determined condition
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        UnwrittenFieldBug bug = new UnwrittenFieldBug();
        System.out.println(bug.showBug()); // Output: 0
    }
}