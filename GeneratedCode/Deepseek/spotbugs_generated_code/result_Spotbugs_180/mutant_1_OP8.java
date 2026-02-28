class BuggyBuffer {
    private byte[] buffer;
    private byte[] tempBuf; // New variable to demonstrate the Renaming mutation operator

    public BuggyBuffer(byte[] input) {
        this.buffer = input;
        this.tempBuf = new byte[input.length]; // Create a copy of the input array
        System.arraycopy(input, 0, tempBuf, 0, input.length); // Copy the content of input array to tempBuf
    }

    public byte[] showBug() {
        return tempBuf; // Return the copy of the buffer instead of the original reference
    }
}