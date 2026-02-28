// Bug Class
class BuggyBuffer {
    private byte[] buffer;

    public BuggyBuffer(byte[] input) {
        this.buffer = input; // BUG: EI2: Exposes internal representation by creating a buffer which incorporates reference to array (EI_EXPOSE_BUF2)

        // Mutated code: Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                // This code will never be executed
                System.out.println("Unreachable code executed");
                break;
        }
    }

    public byte[] showBug() {
        return buffer;
    }

    private int getUnreachableValue() {
        // This method always returns a value that won't match the case in the switch statement
        return -1;
    }
}