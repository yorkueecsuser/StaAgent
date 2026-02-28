// Mutated Bug Class
class BuggyBuffer {
    private byte[] buffer;

    public BuggyBuffer(byte[] input) {
        this.buffer = new byte[input.length];
        for (int i = 0; i < input.length; i++) {
            this.buffer[i] = input[i]; // Make a copy of the input array
        }
    }

    public byte[] showBug() {
        return buffer;
    }
}