class NullDereferenceBug {
    private String buggyString;

    public void setBuggyString(String buggyString) {
        this.buggyString = buggyString;
    }

    public void showBug() {
        // Mutated code: Inserting unreachable if-else branch
        boolean shouldNotRun = false;
        if (shouldNotRun) {
            System.out.println("This code should never run.");
        } else {
            // Original buggy line
            System.out.println(buggyString.length()); // BUG: NP: Null value is guaranteed to be dereferenced (NP_GUARANTEED_DEREF)
        }
    }

    public static void main(String[] args) {
        NullDereferenceBug bug = new NullDereferenceBug();
        bug.showBug();
    }
}