/* This is a Java file that demonstrates the AvoidUsingOctalValues bug. */

class OctalValueBugExample {

    // This method demonstrates the bug by using an octal value in a hexadecimal literal.
    public int showBug(int value) {
        // BUG: AvoidUsingOctalValues
        return 0x100 + value; // The '0x' notation indicates a hexadecimal literal.
    }

    // Unreachable for loop mutation
    public int showMutation(int value) {
        int result = 0;
        for (int i = 0; false; i++) {
            result += i;
        }
        return result;
    }
}