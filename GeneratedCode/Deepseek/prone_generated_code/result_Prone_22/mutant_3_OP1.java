class BugExample {
    private String bug;
    private String unusedVariable;

    public BugExample() {
        this.bug = "ComparingThisWithNull";
        this.unusedVariable = "unused";
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