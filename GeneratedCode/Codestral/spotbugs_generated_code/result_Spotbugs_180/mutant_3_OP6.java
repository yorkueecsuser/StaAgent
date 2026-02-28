// Bug Class
class BuggyBuffer {
    private byte[] buffer;

    public BuggyBuffer(byte[] input) {
        this.buffer = input; // Original bug remains: EI2

        // Unreachable for loop mutant
        boolean shouldNotLoop = false;
        for (int i = 0; shouldNotLoop; i++) {
            // This loop is unreachable as the condition is always false
            System.out.println("This line should never be executed.");
        }
    }

    public byte[] showBug() {
        return buffer;
    }
}