class FinalizeBug {
    private String a; // Renamed'message' to 'a'

    public FinalizeBug(String a) { // Updated the constructor parameter as well
        this.a = a;
    }

    // BUG: FinalizeShouldBeProtected - This method should be protected to prevent it from being explicitly called by other classes
    public void finalize() {
        System.out.println("Finalize method called - " + a); // Updated the print statement to use the renamed variable
    }

    public void showBug() {
        this.a = "Bug demonstration"; // Updated the assignment to use the renamed variable
        System.gc(); // Request the Java garbage collector to run
    }
}