class BuggyFinalize {
    
    protected void finalize() {   // Noncompliant; no call to super.finalize();
        releaseSomeResources();
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
        boolean alwaysFalse = false; 
        if (alwaysFalse) {
            System.out.println("This will never be executed");
        }
    }

    public static void main(String[] args) {
        BuggyFinalize bug = new BuggyFinalize();
        bug.showBug();
    }
}