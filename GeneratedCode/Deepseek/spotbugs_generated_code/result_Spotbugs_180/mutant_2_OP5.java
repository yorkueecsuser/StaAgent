// Bug Class
class BuggyBuffer {
    private byte[] buffer;

    public BuggyBuffer(byte[] input) {
        this.buffer = input;

        // Mutated code: add unreachable switch statement
        if (shouldAddSwitch()) {
            int value = getFalseValue();
            switch (value) {
                case 1:
                    /* This case is unreachable */
                    System.out.println("This line should never be executed.");
                    break;
            }
        }
    }

    public byte[] showBug() {
        return buffer;
    }

    // Method that always returns false for the switch condition
    private boolean shouldAddSwitch() {
        return false;
    }

    // Method that returns a value that is never 1
    private int getFalseValue() {
        return 0;
    }
}