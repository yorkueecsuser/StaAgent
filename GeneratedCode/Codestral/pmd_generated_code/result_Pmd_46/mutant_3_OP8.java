class FinalizeBug {
    private String m; // Renamed'message' to'm'

    public FinalizeBug(String message) {
        this.m = message; // Updated all occurrences of'message' to'm'
    }

    // This method should be protected to prevent it from being explicitly called by other classes
    public void finalize() {
        System.out.println("Finalize method called - " + this.m); // Updated'message' to'm'
    }

    public void showBug() {
        this.m = "Bug demonstration"; // Updated'message' to'm'
        System.gc(); // Request the Java garbage collector to run
    }
}