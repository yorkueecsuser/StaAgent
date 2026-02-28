class FinalizeBug {
    private String message;

    public FinalizeBug(String message) {
        this.message = message;
    }

    // Original method
    public void finalize() {
        System.out.println("Finalize method called - " + message);
    }

    // Mutated code using Unreachable if statement mutation operator
    private boolean getCondition() {
        return false;
    }

    public void showBug() {
        this.message = "Bug demonstration";

        boolean unreachableCondition = getCondition();
        if (unreachableCondition) {
            // This branch is unreachable as getCondition() always returns false
            System.out.println("Unreachable code");
        }

        System.gc(); // Request the Java garbage collector to run
    }
}