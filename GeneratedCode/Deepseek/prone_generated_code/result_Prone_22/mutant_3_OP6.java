class BugExample {
    private String bug;

    public BugExample() {
        this.bug = "ComparingThisWithNull";
    }

    public boolean showBug() {
        if (this == null) { // BUG: ComparingThisWithNull
            return true;
        } else {
            return false;
        }
    }

    // Starting of the mutation
    public boolean getCondition() {
        return false;
    }

    public void mutantMethod() {
        for (int i = 0; getCondition(); i++) { // mutant
            System.out.println("unreachable code");
        }
    }
    // End of the mutation

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug());
        bugExample.mutantMethod(); // mutant calls
    }
}