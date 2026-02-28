class FinalizeBug {
    private String message;
    private boolean isUnreachable = false;

    public FinalizeBug(String message) {
        this.message = message;
    }

    // BUG: FinalizeShouldBeProtected - This method should be protected to prevent it from being explicitly called by other classes
    public void finalize() {
        for (int i = 0; isUnreachable; i++) {
            System.out.println("Unreachable loop iteration: " + i);
        }
        System.out.println("Finalize method called - " + message);
    }

    public void showBug() {
        this.message = "Bug demonstration";
        System.gc(); // Request the Java garbage collector to run
    }
}