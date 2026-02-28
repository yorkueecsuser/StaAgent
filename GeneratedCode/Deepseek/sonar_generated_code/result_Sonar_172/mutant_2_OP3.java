class BuggyFinalize {
    protected boolean unreachableCondition = true;

    protected void finalize() {   // Noncompliant; no call to super.finalize();
        if (unreachableCondition) {
            releaseSomeResources();
        } else {
            System.out.println("This code is unreachable");
        }
    }

    protected void releaseSomeResources() {
        System.out.println("Releasing resources");
    }

    public void showBug() {
        BuggyFinalize buggy = new BuggyFinalize();
        try {
            buggy.finalize(); // The finalizer of this instance
        } catch (Throwable ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        BuggyFinalize bug = new BuggyFinalize();
        bug.showBug();
    }
}