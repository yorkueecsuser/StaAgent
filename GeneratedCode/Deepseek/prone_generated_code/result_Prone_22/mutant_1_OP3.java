class BugExample {
    private String bug;
    private boolean condition; // new variable to use in if statement

    public BugExample() {
        this.bug = "ComparingThisWithNull";
    }

    public boolean showBug() {
        condition = false; // setting condition to false to avoid unreachable statement
        if (this == null && condition) { // BUG: ComparingThisWithNull
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