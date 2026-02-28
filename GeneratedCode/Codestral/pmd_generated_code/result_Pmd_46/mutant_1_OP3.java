class FinalizeBug {
    private String message;

    public FinalizeBug(String message) {
        this.message = message;
    }

    // BUG: FinalizeShouldBeProtected - This method should be protected to prevent it from being explicitly called by other classes
    public void finalize() {
        // Mutant code: Unreachable if statement
        if (getUnreachableCondition()) {
            System.out.println("This code will never be executed");
        }

        System.out.println("Finalize method called - " + message);
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    public void showBug() {
        this.message = "Bug demonstration";
        System.gc(); // Request the Java garbage collector to run
    }
}