/* This is a Java file that demonstrates the AvoidUsingOctalValues bug. */

class OctalValueBugExample {

    // This method demonstrates the bug by using an octal value in a hexadecimal literal.
    public int showBug(int value) {
        // BUG: AvoidUsingOctalValues
        return 0x100 + value; // The '0x' notation indicates a hexadecimal literal.
    }

    // Unreachable switch statement mutant
    public int showBugMutant(int value) {
        switch (value) {
            case 0:
                // Code that is unreachable
                return 0x100 + value;
            default:
                // Default case that is reachable
                return value;
        }
    }
}