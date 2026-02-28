class FinalizeOverloadedExample {

    // This is confusing and probably a bug
    protected void finalize(int a) { // BUG: FinalizeOverloaded
        System.out.println("This finalize method with parameters will never be called by the JVM.");
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This is a reachable if block.");
        } else {
            System.out.println("This is an unreachable else block due to the condition.");
        }
    }

    public void showBug() {
        // This method demonstrates the bug by attempting to call the incorrectly overloaded finalize method.
        // However, the JVM will not call this method.
        try {
            this.finalize(10);
        } catch (Throwable t) {
            t.printStackTrace();
        }
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This is a reachable if block in showBug.");
        } else {
            System.out.println("This is an unreachable else block in showBug due to the condition.");
        }
    }

    private boolean getCondition() {
        return false; // This method always returns false, but it is not a compile-time constant
    }

    public static void main(String[] args) {
        FinalizeOverloadedExample example = new FinalizeOverloadedExample();
        example.showBug();
    }
}