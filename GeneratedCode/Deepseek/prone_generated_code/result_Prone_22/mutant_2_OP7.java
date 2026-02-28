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

    public void mutatedBug() {
        boolean mutantCondition = false;
        while (mutantCondition) {
            // This while loop will never be executed, ensuring this is a unreachable statement.
        }
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug());
        bugExample.mutatedBug();
    }
}