class BugExample {
    private String bug;
    private String bug2;
    private String bug3;

    public BugExample() {
        this.bug = "ComparingThisWithNull";
        this.bug2 = "ComparingThisWithNull";
        this.bug3 = "ComparingThisWithNull";
    }

    public boolean showBug() {
        if (this.bug == null) { // BUG: ComparingThisWithNull
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