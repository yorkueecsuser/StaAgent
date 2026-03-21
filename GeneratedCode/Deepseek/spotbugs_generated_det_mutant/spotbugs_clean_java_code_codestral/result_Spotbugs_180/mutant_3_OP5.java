class BuggyBuffer {
    private byte[] buffer;

    public BuggyBuffer(byte[] input) {
        this.buffer = input;
        int unreachableValue = getUnreachableValue(); // Method call to avoid using a compile-time constant
        switch(unreachableValue) {
            case 1:
                System.out.println("Unreachable code");
                break;
        }
    }

    public byte[] showBug() {
        return buffer;
    }

    private int getUnreachableValue() {
        return -1; // This value is guaranteed to be unreachable in the switch statement
    }
}