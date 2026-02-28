class FinalizeBug {
    private String message;

    public FinalizeBug(String message) {
        this.message = message;
    }

    private boolean getCondition() {
        return false; // Always returns false to make the if-else branch unreachable
    }

    // BUG: FinalizeShouldBeProtected - This method should be protected to prevent it from being explicitly called by other classes
    public void finalize() {
        System.out.println("Finalize method called - " + message);
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is unreachable
            System.out.println("Unreachable block executed");
        } else {
            // This block is the else part of the unreachable if-else statement
            System.out.println("Alternative block executed");
        }
    }

    public void showBug() {
        this.message = "Bug demonstration";
        System.gc(); // Request the Java garbage collector to run
    }
}