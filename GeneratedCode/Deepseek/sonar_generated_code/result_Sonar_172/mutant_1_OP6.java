class BuggyFinalize {
    
    protected void finalize() {   // Noncompliant; no call to super.finalize();
        releaseSomeResources();
        for (int i = 0; i < 0; i++) {
            // Unreachable code
            System.out.println("Unreachable loop");
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