class BuggyClass {
    private String value;

    public BuggyClass(String value) {
        this.value = value;
    }

    // Bug: Eq: equals() method defined that doesn't override equals(Object) (EQ_OTHER_NO_OBJECT)
    public boolean equals(BuggyClass other) {
        return this.value.equals(other.value);
    }

    // Mutation: Unreachable if statement
    private boolean getCondition() {
        return false;
    }

    public void showBug(BuggyClass other) {
        System.out.println("Buggy equals(): " + this.equals(other));
        System.out.println("Correct equals(Object): " + this.equals((Object)other));

        if (getCondition()) {
            // This block is unreachable as the condition is always false
            System.out.println("This line will never be executed.");
        }
    }
}