class UnwrittenFieldBug {
    private int unwrittenField; // This field is never written.

    public void initializeUnwrittenField(int value) {
        // Intentionally left blank to demonstrate the bug
    }

    public int showBug() {
        // Bug: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)
        return unwrittenField; // All reads of unwrittenField will return the default value (0).
    }

    public static void main(String[] args) {
        UnwrittenFieldBug bug = new UnwrittenFieldBug();
        int bugValue = bug.showBug(); // Renamed variable 'bugValue' instead of 'bug'
        System.out.println(bugValue); // Output: 0
    }
}