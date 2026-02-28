class FinalizeBug {
    private String message;

    public FinalizeBug(String message) {
        this.message = message;
    }

    // Mutated Code: FinalizeShouldBeProtected - This method should be protected, but it's made public to introduce the bug
    public void finalize() {
        System.out.println("Finalize method called - " + message);
    }

    public void showBug() {
        this.message = "Bug demonstration";
        System.gc(); // Request the Java garbage collector to run
    }
}