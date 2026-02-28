class FinalizeBug {
    private String message;

    public FinalizeBug(String message) {
        this.message = message;
    }

    protected void finalize() {
        System.out.println("Finalize method called - " + message);
        // Mutant insertion below
        int value = getFalseValue();
        switch (value) {
            case 1:
                System.out.println("Unreachable code");
                break;
        }
    }

    public void showBug() {
        this.message = "Bug demonstration";
        System.gc(); // Request the Java garbage collector to run
    }

    private int getFalseValue() {
        return 0; // Always return 0 to make the switch statement unreachable
    }
}