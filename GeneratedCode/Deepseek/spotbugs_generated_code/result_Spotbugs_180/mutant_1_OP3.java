// Bug Class
class BuggyBuffer {
    private byte[] buffer;

    public BuggyBuffer(byte[] input) {
        this.buffer = input; // BUG: EI2: May expose internal representation by creating a buffer which incorporates reference to array (EI_EXPOSE_BUF2)

        // Mutated Code: Unreachable if statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This statement should never be executed.");
        }
    }

    public byte[] showBug() {
        return buffer;
    }

    // Dummy method to simulate runtime condition for the unreachable if statement
    private boolean getUnreachableCondition() {
        return false;
    }
}