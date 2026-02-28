// Bug Class
class BuggyBuffer {
    private byte[] buffer;

    public BuggyBuffer(byte[] input) {
        this.buffer = input;
    }

    public byte[] showBug() {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // Unreachable code block
            byte[] newBuffer = new byte[buffer.length];
            System.arraycopy(buffer, 0, newBuffer, 0, buffer.length);
            return newBuffer;
        } else {
            // Original code block
            return buffer;
        }
    }
}