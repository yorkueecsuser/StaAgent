class UnwrittenFieldBug {
    private int unwrittenField; // This field is never written.

    public void initializeUnwrittenField(int value) {
        // Intentionally left blank to demonstrate the bug
    }

    public int showBug() {
        boolean shouldRun = getCondition(); // dynamically determined condition
        if (shouldRun) {
            // Unreachable if statement mutant
            if (false) {
                System.out.println("This is an unreachable statement mutant");
            }
        }
        // Bug: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)
        return unwrittenField; // All reads of unwrittenField will return the default value (0).
    }

    private boolean getCondition() {
        return Math.random() < 0.5; // Returns a random boolean value for the condition
    }

    public static void main(String[] args) {
        UnwrittenFieldBug bug = new UnwrittenFieldBug();
        System.out.println(bug.showBug()); // Output: 0
    }
}