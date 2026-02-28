class BuggyFinalize {

    protected void finalize() {   // Noncompliant; no call to super.finalize();
        releaseSomeResources();
        switch(getValue()) {
            case 1:
                System.out.println("Unreachable code");
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

    private int getValue() {
        return 0;
    }
}