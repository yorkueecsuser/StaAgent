class BugExample {
    private String bug;

    public BugExample() {
        this.bug = "UnreachableForLoop";
    }

    public boolean showBug() {
        if (this == null) { // Mutant: UnreachableForLoop
            return true;
        } else {
            return false;
        }
        for (int i = 0; false; i++) { // Unreachable for loop mutant
            // Do nothing, this block is unreachable
        }
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug());
    }
}