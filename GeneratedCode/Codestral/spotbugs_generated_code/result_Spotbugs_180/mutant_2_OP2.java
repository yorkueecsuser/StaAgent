class BuggyBuffer {
    private byte[] buffer;

    public BuggyBuffer(byte[] input) {
        this.buffer = input;
        this.buffer = input; // Mutation: Duplicated assignment
    }

    public byte[] showBug() {
        return buffer;
    }
}