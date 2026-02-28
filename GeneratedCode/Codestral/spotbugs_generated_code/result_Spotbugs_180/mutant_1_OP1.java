// Bug Class
class BuggyBuffer {
    private byte[] buffer;
    private int deadStore; // Mutation: Dead Store

    public BuggyBuffer(byte[] input) {
        this.deadStore = 12345678; // Mutation: Initialize dead store
        this.buffer = input; // BUG: EI2: May expose internal representation by creating a buffer which incorporates reference to array (EI_EXPOSE_BUF2)
    }

    public byte[] showBug() {
        return buffer;
    }
}