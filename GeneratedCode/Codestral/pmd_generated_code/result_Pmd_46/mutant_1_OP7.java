class FinalizeBug {
    private String message;

    public FinalizeBug(String message) {
        this.message = message;
    }

    // BUG: FinalizeShouldBeProtected - This method should be protected to prevent it from being explicitly called by other classes
    public void finalize() {
        boolean conditionWhile = getCondition(); // Non-final variable or method call to avoid compile-time constant
        while (conditionWhile) {
            // Unreachable while loop
            System.out.println("This is an unreachable while loop");
        }
        System.out.println("Finalize method called - " + message);
    }

    private boolean getCondition() {
        return false; // Always returns false to make the loop unreachable
    }

    public void showBug() {
        this.message = "Bug demonstration";
        System.gc(); // Request the Java garbage collector to run
    }
}