class UnwrittenFieldBug {
    private int unwrittenField; // This field is never written.

    public void initializeUnwrittenField(int value) {
        // Intentionally left blank to demonstrate the bug
    }

    public int showBug() {
        // Bug: UwF: Unwritten field (UWF_UNWRITTEN_FIELD)
        // Mutation: Unreachable switch statement
        boolean runSwitch = false;
        switch (unwrittenField) {
            case 1:
                if (runSwitch) {
                    // Unreachable code
                    System.out.println("This code should never execute.");
                }
                break;
        }
        return unwrittenField; // All reads of unwrittenField will return the default value (0).
    }

    public static void main(String[] args) {
        UnwrittenFieldBug bug = new UnwrittenFieldBug();
        System.out.println(bug.showBug()); // Output: 0
    }
}