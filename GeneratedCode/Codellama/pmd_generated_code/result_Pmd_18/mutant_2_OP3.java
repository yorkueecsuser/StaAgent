/* This is a Java file that demonstrates the AvoidUsingOctalValues bug. */

class OctalValueBugExample {

    // This method demonstrates the bug by using an octal value in a hexadecimal literal.
    public int showBug(int value) {
        // BUG: AvoidUsingOctalValues
        return 0x100 + value; // The '0x' notation indicates a hexadecimal literal.
    }

    // This method is unreachable since the conditional statement is always false
    public int unreachableMethod(int value) {
        if (false) {
            return value;
        } else {
            return 0;
        }
    }
}