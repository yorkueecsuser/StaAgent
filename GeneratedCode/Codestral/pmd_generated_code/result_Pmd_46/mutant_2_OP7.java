class FinalizeBug {
    private String message;

    public FinalizeBug(String message) {
        this.message = message;
    }

    public void finalize() {
        boolean shouldNotRun = false; // Added this line for the unreachable while loop
        while (shouldNotRun) { // Unreachable while loop
            System.out.println("Unreachable while loop executed!");
        }
        System.out.println("Finalize method called - " + message);
    }

    public void showBug() {
        this.message = "Bug demonstration";
        System.gc(); // Request the Java garbage collector to run
    }
}