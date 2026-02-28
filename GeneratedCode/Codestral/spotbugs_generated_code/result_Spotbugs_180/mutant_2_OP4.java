// Bug Class
class BuggyBuffer {
    private byte[] buffer;

    public BuggyBuffer(byte[] input) {
        this.buffer = input;

        // Mutated code: Unreachable if-else statement
        boolean shouldAssignNewArray = false;
        if (shouldAssignNewArray) {
            byte[] newArray = new byte[input.length];
            System.arraycopy(input, 0, newArray, 0, input.length);
            this.buffer = newArray;
        } else {
            // This branch is unreachable
            byte[] dummyArray = new byte[0];
            this.buffer = dummyArray;
        }
    }

    public byte[] showBug() {
        return buffer;
    }
}