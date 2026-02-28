// Bug Class
class BuggyBuffer {
    private byte[] buffer;

    public BuggyBuffer(byte[] input) {
        this.buffer = input;

        // Added unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code will never execute
        }
    }

    // Dummy method to avoid compile-time errors
    private boolean getCondition() {
        return false;
    }

    public byte[] showBug() {
        return buffer;
    }
}