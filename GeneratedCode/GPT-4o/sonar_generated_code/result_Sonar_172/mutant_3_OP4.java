class FinalizeExample {

    // Method to simulate resource release
    private void releaseSomeResources() {
        System.out.println("Releasing some resources...");
    }

    // Incorrectly overridden finalize method
    @Override
    protected void finalize() throws Throwable {
        super.finalize(); // BUG: "super.finalize()" should be called at the end of "Object.finalize()" implementations
        releaseSomeResources();

        // Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never print.");
        } else {
            System.out.println("This will always print.");
        }
    }

    // Method to demonstrate the bug
    public void showBug() {
        // Creating an object to demonstrate finalize call
        FinalizeExample example = new FinalizeExample();
        example = null;
        
        // Suggesting garbage collection for demonstration purposes
        System.gc();
    }

    public static void main(String[] args) {
        FinalizeExample example = new FinalizeExample();
        example.showBug();
    }

    // Helper method to return a constant false value dynamically
    private boolean getCondition() {
        return false;
    }
}