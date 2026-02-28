// Bug Class
class BuggyBuffer {
    private byte[] buffer;

    public BuggyBuffer(byte[] input) {
        this.buffer = input; // BUG: EI2: May expose internal representation by creating a buffer which incorporates reference to array (EI_EXPOSE_BUF2)

        boolean unreachableCondition = false; // condition that is always false
        if (unreachableCondition) {
            // Unreachable code
            System.out.println("This code should never be executed.");
        }
    }

    public byte[] showBug() {
        return buffer;
    }
}