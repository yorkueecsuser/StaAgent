class BugExample {
    private String bug;

    public BugExample() {
        this.bug = "ComparingThisWithNull";
    }

    public boolean showBug() {
        if (this == null) { // Mutated Code: Duplicating original if-statement
            return true;
        } else {
            return false;
        }

        if (this == null) { // Duplicated Mutation
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