class BuggyClass {
    private String value;

    public BuggyClass(String value) {
        this.value = value;
    }

    // Bug: Eq: equals() method defined that doesn't override equals(Object) (EQ_OTHER_NO_OBJECT)
    public boolean equals(BuggyClass other) {
        return this.value.equals(other.value);
    }

    // Mutant code: Unreachable if-else statement
    private boolean getCondition() {
        return false;
    }

    public void showBug(BuggyClass other) {
        System.out.println("Buggy equals(): " + this.equals(other));
        System.out.println("Correct equals(Object): " + this.equals((Object)other));

        // Unreachable if-else statement
        if (getCondition()) {
            System.out.println("This line should never be executed!");
        } else {
            // This block is unreachable due to the condition always being false
            System.out.println("This line is part of an unreachable if-else statement!");
        }
    }
}