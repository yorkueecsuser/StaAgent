class BuggyClass {
    private String val; // Renamed 'value' to 'val'

    public BuggyClass(String val) {
        this.val = val;
    }

    // Bug: Eq: equals() method defined that doesn't override equals(Object) (EQ_OTHER_NO_OBJECT)
    public boolean equals(BuggyClass other) {
        return this.val.equals(other.val); // Updated to use renamed variable
    }

    public void showBug(BuggyClass other) {
        System.out.println("Buggy equals(): " + this.equals(other));
        System.out.println("Correct equals(Object): " + this.equals((Object)other));
    }
}