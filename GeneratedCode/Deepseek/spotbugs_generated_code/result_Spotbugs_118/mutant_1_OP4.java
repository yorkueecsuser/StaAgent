class BuggyCode {
    public boolean showBug(Object obj) {
        return obj instanceof String;
    }

    public void unreachableBranch() {
        boolean alwaysFalse = false;
        if (alwaysFalse) {
            System.out.println("This code will never be executed.");
        } else {
            System.out.println("This is the reachable branch.");
        }
    }
}