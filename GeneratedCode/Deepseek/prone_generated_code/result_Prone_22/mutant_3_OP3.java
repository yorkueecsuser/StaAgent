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

        boolean unreachableBranch = true; // Unreachable branch
        if (unreachableBranch) { // Unreachable if statement
            // Unreachable code
            System.out.println("This code is unreachable");
        }
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug());
    }
}