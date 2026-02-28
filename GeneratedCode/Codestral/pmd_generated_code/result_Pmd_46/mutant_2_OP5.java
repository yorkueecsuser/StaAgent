class FinalizeBug {
    private String message;

    public FinalizeBug(String message) {
        this.message = message;
    }

    // BUG: FinalizeShouldBeProtected - This method should be protected to prevent it from being explicitly called by other classes
    public void finalize() {
        int value = getUnreachableValue(); // Method that returns a value that makes the switch statement unreachable
        switch(value) {
            case 1:
                // Unreachable code
                System.out.println("Unreachable code in finalize method");
                break;
        }
        System.out.println("Finalize method called - " + message);
    }

    private int getUnreachableValue() {
        return -1; // Always returns a value that makes the switch statement unreachable
    }

    public void showBug() {
        this.message = "Bug demonstration";
        System.gc(); // Request the Java garbage collector to run
    }
}