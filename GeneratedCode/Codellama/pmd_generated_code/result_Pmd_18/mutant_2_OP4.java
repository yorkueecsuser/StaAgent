/* This is a Java file that demonstrates the AvoidUsingOctalValues bug. */

class OctalValueBugExample {

    // This method demonstrates the bug by using an octal value in a hexadecimal literal.
    public int showBug(int value) {
        // BUG: AvoidUsingOctalValues
        return 0x100 + value; // The '0x' notation indicates a hexadecimal literal.
    }

    // This method demonstrates the solution by removing the octal value.
    public int showSolution(int value) {
        return 0x100 + value; // The '0x' notation indicates a hexadecimal literal.
    }
}