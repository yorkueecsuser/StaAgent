class BuggyClass {
    private String value;
    private String duplicateValue;  // Mutant code: Duplicated assignment

    public BuggyClass(String value) {
        this.value = value;
        this.duplicateValue = this.value;  // Mutant code: Duplicated assignment
    }

    // Bug: Eq: equals() method defined that doesn't override equals(Object) (EQ_OTHER_NO_OBJECT)
    public boolean equals(BuggyClass other) {
        return this.value.equals(other.value);
    }

    public void showBug(BuggyClass other) {
        System.out.println("Buggy equals(): " + this.equals(other));
        System.out.println("Correct equals(Object): " + this.equals((Object)other));
    }
}