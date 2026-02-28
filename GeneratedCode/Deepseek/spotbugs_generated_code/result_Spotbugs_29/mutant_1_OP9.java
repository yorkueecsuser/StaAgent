class BuggyClass {
    private String value;

    public BuggyClass(String value) {
        this.value = value;
    }

    // Original bug: Eq: equals() method defined that doesn't override equals(Object) (EQ_OTHER_NO_OBJECT)
    public boolean equals(BuggyClass other) {
        return this.value.equals(other.value);
    }

    // Mutated code: Adding an overriding equals(Object) method to fix the bug
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass()!= obj.getClass())
            return false;
        BuggyClass other = (BuggyClass) obj;
        return this.value.equals(other.value);
    }

    public void showBug(BuggyClass other) {
        System.out.println("Buggy equals(): " + this.equals(other));
        System.out.println("Fixed equals(Object): " + this.equals((Object)other));
    }
}