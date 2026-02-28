class FinalizeOverloadedExample {

    // This is confusing and probably a bug
    protected void finalize(int a) { // BUG: FinalizeOverloaded
        System.out.println("This finalize method with parameters will never be called by the JVM.");

        // Inserting an unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case will never be executed because condition is always false
                System.out.println("Unreachable case 0");
                break;
            case 1:
                // This case will always be executed
                System.out.println("Reachable case 1");
                break;
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the switch statement's first case unreachable
        return false;
    }

    public void showBug() {
        // This method demonstrates the bug by attempting to call the incorrectly overloaded finalize method.
        // However, the JVM will not call this method.
        try {
            this.finalize(10);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FinalizeOverloadedExample example = new FinalizeOverloadedExample();
        example.showBug();
    }
}