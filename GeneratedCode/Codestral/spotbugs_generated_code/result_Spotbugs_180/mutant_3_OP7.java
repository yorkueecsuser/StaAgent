class BuggyBuffer {
    private byte[] buffer;

    public BuggyBuffer(byte[] input) {
        this.buffer = input; // BUG: EI2: May expose internal representation by creating a buffer which incorporates reference to array (EI_EXPOSE_BUF2)
        unreachableLoop(); // Inserted unreachable while loop
    }

    public byte[] showBug() {
        return buffer;
    }

    private void unreachableLoop() {
        boolean condition = getCondition();
        while (condition) { // Unreachable while loop
            // This code will never be executed
            System.out.println("This is an unreachable loop.");
            break; // Adding break to ensure loop finishes
        }
    }

    private boolean getCondition() {
        return false; // Always returns false to make the loop unreachable
    }
}