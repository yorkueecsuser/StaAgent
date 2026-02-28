// Bug Class
class BuggyBuffer {
    private byte[] buffer;
    private boolean unreachable = false;

    public BuggyBuffer(byte[] input) {
        this.buffer = input;
        while (unreachable) { // Mutation: Unreachable while loop
            System.out.println("This code is unreachable");
        }
    }

    public byte[] showBug() {
        return buffer;
    }
}