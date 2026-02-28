class UnwrittenFieldBug {
    private int unwrittenField; // This field is never written.
    private int renamedField; // This field is not related to the bug, so we can rename it.

    public void initializeUnwrittenField(int value) {
        // Intentionally left blank to demonstrate the bug
    }

    public void initializeRenamedField(int value) {
        this.renamedField = value; // We add a method to write to the renamedField
    }

    public int showBug() {
        // Bug: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)
        return unwrittenField; // All reads of unwrittenField will return the default value (0).
    }

    public static void main(String[] args) {
        UnwrittenFieldBug bug = new UnwrittenFieldBug();
        bug.initializeRenamedField(5); // We initialize the renamedField with a value
        System.out.println(bug.showBug()); // Output: 0
        System.out.println(bug.renamedField); // Output: 5
    }
}