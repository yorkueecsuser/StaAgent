class FinalizeBug {
    private String message;

    public FinalizeBug(String message) {
        this.message = message;
    }

    protected void finalize() {
        System.out.println("Finalize method called - " + message);

        // Unreachable if-else branch
        if (getCondition()) {
            System.out.println("This branch is unreachable!");
        } else {
            // This else branch is unreachable
        }
    }

    public void showBug() {
        this.message = "Bug demonstration";
        System.gc(); // Request the Java garbage collector to run
    }

    // Method to return false for the unreachable branch
    private boolean getCondition() {
        return false;
    }
}