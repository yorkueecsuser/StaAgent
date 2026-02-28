class BuggyClass {
    private String value;
    private boolean unreachableCondition = false;

    public BuggyClass(String value) {
        this.value = value;
    }

    // Bug: Eq: equals() method defined that doesn't override equals(Object) (EQ_OTHER_NO_OBJECT)
    public boolean equals(BuggyClass other) {
        if (unreachableCondition) {
            System.out.println("This line should never be executed.");
        }
        return this.value.equals(other.value);
    }

    public void showBug(BuggyClass other) {
        System.out.println("Buggy equals(): " + this.equals(other));
        System.out.println("Correct equals(Object): " + this.equals((Object)other));
    }

    // Method to ensure dynamic condition for unreachable branch
    private boolean getCondition() {
        return unreachableCondition;
    }
}