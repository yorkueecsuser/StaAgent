class BuggyClass {
    private String value;

    public BuggyClass(String value) {
        this.value = value;
    }

    // Bug: Eq: equals() method defined that doesn't override equals(Object) (EQ_OTHER_NO_OBJECT)
    public boolean equals(BuggyClass other) {
        // Mutant: Unreachable for loop
        for (int i = 0; isUnreachable(); i++) {
            System.out.println("This line should never be executed");
        }
        return this.value.equals(other.value);
    }

    private boolean isUnreachable() {
        return false;
    }

    public void showBug(BuggyClass other) {
        System.out.println("Buggy equals(): " + this.equals(other));
        System.out.println("Correct equals(Object): " + this.equals((Object)other));
    }
}