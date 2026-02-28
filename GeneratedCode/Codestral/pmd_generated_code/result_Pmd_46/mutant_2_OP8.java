class FinalizeBug {
    private String message;
    private String a;  // Mutated variable name

    public FinalizeBug(String message) {
        this.message = message;
        this.a = message;  // Initializing the mutated variable
    }

    // BUG: FinalizeShouldBeProtected - This method should be protected to prevent it from being explicitly called by other classes
    public void finalize() {
        System.out.println("Finalize method called - " + a);  // Using the mutated variable name
    }

    public void showBug() {
        this.a = "Bug demonstration";  // Using the mutated variable name
        System.gc(); // Request the Java garbage collector to run
    }
}