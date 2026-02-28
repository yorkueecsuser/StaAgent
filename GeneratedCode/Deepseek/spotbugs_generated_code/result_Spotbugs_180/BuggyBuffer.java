// Bug Class
class BuggyBuffer {
    private byte[] buffer;

    public BuggyBuffer(byte[] input) {
        this.buffer = new byte[input.length];
        int i = 0;
        do {
            this.buffer[i] = input[i]; // MUTANT: Equivalent Loop Replacement
            i++;
        } while (i < input.length);
    }

    public byte[] showBug() {
        return buffer;
    }
}