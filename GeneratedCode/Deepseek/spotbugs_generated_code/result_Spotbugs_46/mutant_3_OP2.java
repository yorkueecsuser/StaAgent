class UnwrittenFieldBug {
    private int unwrittenField; // This field is never written.

    public void initializeUnwrittenField(int value) {
        unwrittenField = value; // Intentionally left blank to demonstrate the bug
        unwrittenField = value; // Duplicated line for the mutation operator
    }

    public int showBug() {
        // Bug: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)
        return unwrittenField; // All reads of unwrittenField will return the default value (0).
    }

    public static void main(String[] args) {
        UnwrittenFieldBug bug = new UnwrittenFieldBug();
        bug.initializeUnwrittenField(5); // Initialize with a value for demonstrating the bug
        System.out.println(bug.showBug()); // Still outputs: 0 due to the bug
    }
}