class BuggyBuffer {
    private byte[] buffer;

    public BuggyBuffer(byte[] input) {
        this.buffer = input; // EI2: May expose internal representation by creating a buffer which incorporates reference to array (EI_EXPOSE_BUF2)

        // Mutant: Unreachable for loop
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable because the condition is always false.
            System.out.println("This line will never be executed.");
        }
    }

    public byte[] showBug() {
        return buffer;
    }
}