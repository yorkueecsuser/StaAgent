class FinalizeBug {
    private String message;

    public FinalizeBug(String message) {
        this.message = message;
    }

    // BUG: FinalizeShouldBeProtected - This method should be protected to prevent it from being explicitly called by other classes
    public void finalize() {
        boolean condition = getCondition(); // Added dynamically determined condition
        for (int i = 0; condition; i++) {
            // Unreachable for loop
            // This loop is always false, making it unreachable
            System.out.println("Unreachable code");
        }
        System.out.println("Finalize method called - " + message);
    }

    public void showBug() {
        this.message = "Bug demonstration";
        System.gc(); // Request the Java garbage collector to run
    }

    private boolean getCondition() { // Method to dynamically determine the condition
        return false;
    }
}