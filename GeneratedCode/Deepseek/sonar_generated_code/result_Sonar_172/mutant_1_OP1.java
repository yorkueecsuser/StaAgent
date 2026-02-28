class BuggyFinalize {
    
    protected void finalize() {   // Noncompliant; no call to super.finalize();
        finalize("abcdefgh");  // Mutation Operator addition
        releaseSomeResources();
    }

    protected void finalize(String str) {    // Mutation Operator addition
        str = "ijklmnop";    // Mutation Operator addition
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