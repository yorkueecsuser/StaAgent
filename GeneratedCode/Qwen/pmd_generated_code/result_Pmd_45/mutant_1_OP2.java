class FinalizeOverloadedExample {

    // This is confusing and probably a bug
    protected void finalize(int a) { // BUG: FinalizeOverloaded
        System.out.println("This finalize method with parameters will never be called by the JVM.");
    }

    public void showBug() {
        // This method demonstrates the bug by attempting to call the incorrectly overloaded finalize method.
        // However, the JVM will not call this method.
        int testValue = 10; // Introducing an assignment statement for demonstration
        int testValue = 10; // Duplicate of the above assignment statement

        try {
            this.finalize(testValue);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public static void main(String[] args) {
        FinalizeOverloadedExample example = new FinalizeOverloadedExample();
        example.showBug();
    }
}