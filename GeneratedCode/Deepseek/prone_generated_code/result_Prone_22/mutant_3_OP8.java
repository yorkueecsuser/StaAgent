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

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug());
    }
}

/*
 * Renaming mutation operator replaced the 'bug' user-defined variable with 'b'. 
 * The'showBug()' method now looks like:
 */

public boolean showBug() {
    if (this.b == null) { // Mutation
        return true;
    } else {
        return false;
    }
}