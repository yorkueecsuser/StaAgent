class BuggyClass {
    private String value;

    public BuggyClass(String value) {
        this.value = value;
    }

    // Bug: Eq: equals() method defined that doesn't override equals(Object) (EQ_OTHER_NO_OBJECT)
    public boolean equals(BuggyClass other) {
        boolean unreachableCondition = getUnreachableCondition(); // Dynamically determined method call
        while (unreachableCondition) {
            // This loop is unreachable, as getUnreachableCondition() always returns false
            System.out.println("This line should never be reached!");
        }
        return this.value.equals(other.value);
    }

    public void showBug(BuggyClass other) {
        System.out.println("Buggy equals(): " + this.equals(other));
        System.out.println("Correct equals(Object): " + this.equals((Object)other));
    }

    private boolean getUnreachableCondition() {
        return false; // This method always returns false, making the while loop unreachable
    }
}