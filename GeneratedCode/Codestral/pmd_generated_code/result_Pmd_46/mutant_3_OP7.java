class FinalizeBug {
    private String message;

    public FinalizeBug(String message) {
        this.message = message;
    }

    // BUG: FinalizeShouldBeProtected - This method should be protected to prevent it from being explicitly called by other classes
    // Added unreachable while loop
    public void finalize() {
        System.out.println("Finalize method called - " + message);
        while (getFalseCondition()) {
            // This loop is unreachable
            System.out.println("Unreachable code");
        }
    }

    public void showBug() {
        this.message = "Bug demonstration";
        System.gc(); // Request the Java garbage collector to run
    }

    private boolean getFalseCondition() {
        return false;
    }
}