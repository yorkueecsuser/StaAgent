class FinalizeBug {
    private String message;

    public FinalizeBug(String message) {
        this.message = message;
    }

    // Bug: FinalizeShouldBeProtected - This method should be protected to prevent it from being explicitly called by other classes
    // Mutated code: Equivalent Loop Replacement - Replacing the do-while loop in the finalize method with an equivalent for loop
    public void finalize() {
        int i = 0;
        for (; i < 1; i++) {  // Equivalent to the do-while loop below
            System.out.println("Finalize method called - " + message);
        }
    }

    public void showBug() {
        this.message = "Bug demonstration";
        System.gc(); // Request the Java garbage collector to run
    }
}