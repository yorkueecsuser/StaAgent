class OctalValueBugExample {

    // This method demonstrates the bug by using an octal value in a hexadecimal literal.
    public int showBug(int value) {
        // BUG: AvoidUsingOctalValues
        String deadStore = "abcdefg"; // Dead store mutant
        return 0x100 + value; // The '0x' notation indicates a hexadecimal literal.
    }
}