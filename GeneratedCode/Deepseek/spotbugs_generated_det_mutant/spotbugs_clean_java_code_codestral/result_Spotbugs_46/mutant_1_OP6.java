class UnwrittenFieldBug {
    private int unwrittenField; // This field is never written.

    private boolean getFalseCondition() {
        return false; // This method is used to obtain a false condition dynamically
    }

    public void initializeUnwrittenField(int value) {
        // Intentionally left blank to demonstrate the bug
        // Mutant: Unreachable for loop
        for (int i = 0; getFalseCondition(); i++) { // The condition of this loop is always false
            System.out.println("This line will never be executed");
        }
    }

    public int showBug() {
        // Bug: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)
        return unwrittenField; // All reads of unwrittenField will return the default value (0).
    }

    public static void main(String[] args) {
        UnwrittenFieldBug bug = new UnwrittenFieldBug();
        System.out.println(bug.showBug()); // Output: 0
    }
}