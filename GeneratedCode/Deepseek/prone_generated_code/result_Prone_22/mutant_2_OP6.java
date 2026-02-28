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

    public void unreachableLoop() {
        boolean condition = false;
        for (int i = 0; condition; i++) {
            // This code will never be reached due to the unreachable loop.
        }
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        System.out.println(bugExample.showBug());
        bugExample.unreachableLoop();
    }
}