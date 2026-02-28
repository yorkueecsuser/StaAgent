class FinalizeBug {
    private String message;

    public FinalizeBug(String message) {
        this.message = message;
    }

    public void finalize() {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // Unreachable code
            System.out.println("This code should never execute");
        } else {
            // Original code
            System.out.println("Finalize method called - " + message);
        }
    }

    public boolean getUnreachableCondition() {
        return false;
    }

    public void showBug() {
        this.message = "Bug demonstration";
        System.gc(); // Request the Java garbage collector to run
    }
}