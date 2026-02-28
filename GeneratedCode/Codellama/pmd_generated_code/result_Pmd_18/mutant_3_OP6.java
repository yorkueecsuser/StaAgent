/* This is a Java file that demonstrates the AvoidUsingOctalValues bug with Unreachable for loop mutation operator. */

class OctalValueBugExample {

    // This method demonstrates the bug by using an octal value in a hexadecimal literal.
    public int showBug(int value) {
        // BUG: AvoidUsingOctalValues
        // MUTATION: Unreachable for loop
        int i=0;
        for(;false;i++);
        return 0x100 + value; // The '0x' notation indicates a hexadecimal literal.
    }
}