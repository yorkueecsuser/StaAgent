class FinalizeOverloadedExample {

    // This is confusing and probably a bug
    protected void finalize(int a) { // BUG: FinalizeOverloaded
        System.out.println("This finalize method with parameters will never be called by the JVM.");
        boolean condition = getCondition();
        if (condition) {
            // This is an unreachable if statement due to the condition always being false at runtime
            System.out.println("This message will never be printed.");
        }
    }

    private boolean getCondition() {
        // This method returns false, making the if statement condition always false
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
        boolean condition = getCondition();
        if (condition) {
            // This is an unreachable if statement due to the condition always being false at runtime
            System.out.println("This message will never be printed in showBug.");
        }
    }

    public static void main(String[] args) {
        FinalizeOverloadedExample example = new FinalizeOverloadedExample();
        example.showBug();
        boolean condition = getStaticCondition();
        if (condition) {
            // This is an unreachable if statement due to the condition always being false at runtime
            System.out.println("This message will never be printed in main.");
        }
    }

    private static boolean getStaticCondition() {
        // This method returns false, making the if statement condition always false
        return false;
    }
}