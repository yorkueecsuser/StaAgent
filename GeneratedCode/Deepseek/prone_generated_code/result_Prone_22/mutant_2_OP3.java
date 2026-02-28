class BugExample {
    private String bug;

    public BugExample() {
        this.bug = "UnreachableIfStatement";
    }

    public boolean showBug() {
        boolean unreachableIfStatement = false;
        if (unreachableIfStatement) { // UnreachableIfStatement
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