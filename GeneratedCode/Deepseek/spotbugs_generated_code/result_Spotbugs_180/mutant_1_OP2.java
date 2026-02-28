// Bug Class
class BuggyBuffer {
    private byte[] buffer;
    private byte[] duplicatedBuffer;

    public BuggyBuffer(byte[] input) {
        this.buffer = input;
        this.duplicatedBuffer = buffer; // Mutated Code: Duplication of the assignment statement
    }

    public byte[] showBug() {
        return buffer;
    }

    public byte[] showMutant() {
        return duplicatedBuffer; // Added method to return the duplicated buffer
    }
}