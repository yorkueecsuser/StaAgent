class NullDereferenceBug {
    private String buggyString;
    private String deadStore; // Mutant code: dead store variable

    public void setBuggyString(String buggyString) {
        this.buggyString = buggyString;
    }

    public void showBug() {
        deadStore = "unusedVariable"; // Mutant code: assignment to dead store variable
        // Buggy line: We're assuming that buggyString is never null, but it might be.
        System.out.println(buggyString.length()); // BUG: NP: Null value is guaranteed to be dereferenced (NP_GUARANTEED_DEREF)
    }

    public static void main(String[] args) {
        NullDereferenceBug bug = new NullDereferenceBug();
        // For demonstration purposes, we're not setting buggyString.
        // In a real-world scenario, this might happen due to a programming error or a race condition.
        bug.showBug();
    }
}