// Bug Class
class BuggyBuffer {
    private byte[] buffer;
    private byte[] duplicateBuffer; // Added for mutation

    public BuggyBuffer(byte[] input) {
        this.buffer = input; // Original assignment
        this.duplicateBuffer = buffer; // Added for mutation
    }

    public byte[] showBug() {
        return buffer;
    }

    // New method added for mutation
    public byte[] showDuplicateBug() {
        return duplicateBuffer;
    }
}