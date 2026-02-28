class BuggyBuffer {
    private byte[] buffer;

    public BuggyBuffer(byte[] a) {
        this.buffer = a; // Renamed the 'input' variable to 'a'
    }

    public byte[] showBug() {
        return buffer;
    }
}