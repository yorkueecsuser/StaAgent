class BuggyBuffer {
    private byte[] buffer;

    public BuggyBuffer(byte[] input) {
        this.buffer = input;

        // Unreachable for loop mutant
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // This loop is unreachable because condition is always false
            System.out.println("This is an unreachable loop");
        }
    }

    public byte[] showBug() {
        return buffer;
    }

    // Dummy method for demonstration purposes
    private boolean getCondition() {
        return false;
    }
}