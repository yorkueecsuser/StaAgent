// Bug Class
class BuggyBuffer {
    private byte[] buffer;

    public BuggyBuffer(byte[] input) {
        this.buffer = input;
        boolean dummyCondition = getDummyCondition();
        if (dummyCondition) { // Mutant code: Unreachable if statement
            System.out.println("This line will never be executed.");
        }
    }

    private boolean getDummyCondition() { // Method to return a false value
        return false;
    }

    public byte[] showBug() {
        return buffer;
    }
}