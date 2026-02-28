class UnwrittenFieldBug {
    private int unwrittenField; // This field is never written.

    private boolean getUnreachableCondition() {
        return false;
    }

    public void initializeUnwrittenField(int value) {
        // Intentionally left blank to demonstrate the bug
        if(getUnreachableCondition()) {  // Unreachable if statement
            unwrittenField = value;
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