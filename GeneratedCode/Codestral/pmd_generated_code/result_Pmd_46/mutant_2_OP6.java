class FinalizeBug {
    private String message;

    public FinalizeBug(String message) {
        this.message = message;
    }

    // BUG: FinalizeShouldBeProtected - This method should be protected to prevent it from being explicitly called by other classes
    public void finalize() {
        // Unreachable for loop mutant
        for (int i = 0; getCondition(); i++) {
            System.out.println("Unreachable loop iteration: " + i);
        }
        System.out.println("Finalize method called - " + message);
    }

    public void showBug() {
        this.message = "Bug demonstration";
        System.gc(); // Request the Java garbage collector to run
    }

    // Dummy method to return false, making the loop unreachable
    private boolean getCondition() {
        return false;
    }
}