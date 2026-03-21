class BuggyClass {
    private String value;

    public BuggyClass(String value) {
        this.value = value;
    }

    // Bug: Eq: equals() method defined that doesn't override equals(Object) (EQ_OTHER_NO_OBJECT)
    public boolean equals(BuggyClass other) {
        return this.value.equals(other.value);
    }

    // Mutant: Unreachable switch statement
    public void unreachableSwitchStatement() {
        int value = getUnreachableValue();
        switch (value) {
            case 1:
                System.out.println("This line is unreachable");
                break;
            default:
                System.out.println("This line is reachable");
                break;
        }
    }

    private int getUnreachableValue() {
        // This method always returns a value that makes the switch statement unreachable
        return -1;
    }

    public void showBug(BuggyClass other) {
        System.out.println("Buggy equals(): " + this.equals(other));
        System.out.println("Correct equals(Object): " + this.equals((Object)other));
    }
}