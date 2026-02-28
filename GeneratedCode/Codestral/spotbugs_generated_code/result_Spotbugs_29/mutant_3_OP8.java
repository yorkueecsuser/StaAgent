class BuggyClass {
    private String val; // Renaming 'value' to 'val'

    public BuggyClass(String val) {
        this.val = val;
    }

    public boolean equals(BuggyClass other) {
        return this.val.equals(other.val); // Using 'val' instead of 'value'
    }

    public void showBug(BuggyClass other) {
        System.out.println("Buggy equals(): " + this.equals(other));
        System.out.println("Correct equals(Object): " + this.equals((Object)other));
    }
}