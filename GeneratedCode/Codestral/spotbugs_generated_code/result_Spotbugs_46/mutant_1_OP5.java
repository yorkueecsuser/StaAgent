class UnwrittenFieldBug {
    private int unwrittenField; // This field is never written.

    public void initializeUnwrittenField(int value) {
        // Intentionally left blank to demonstrate the bug
    }

    public int showBug() {
        // Original bug
        // return unwrittenField; // All reads of unwrittenField will return the default value (0).

        // Mutation: Unreachable switch statement
        boolean condition = getCondition();
        if (condition) {
            int value = getValue();
            switch (value) {
                case 1:
                    // This case is unreachable
                    System.out.println("Unreachable code");
                    break;
                default:
                    return unwrittenField;
            }
        } else {
            return unwrittenField;
        }
    }

    private boolean getCondition() {
        return false;
    }

    private int getValue() {
        return 0;
    }

    public static void main(String[] args) {
        UnwrittenFieldBug bug = new UnwrittenFieldBug();
        System.out.println(bug.showBug()); // Output: 0
    }
}