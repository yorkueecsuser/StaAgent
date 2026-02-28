/* This is a Java file that demonstrates the AvoidUsingOctalValues bug. */

class OctalValueBugExample {

    // This method demonstrates the bug by using an octal value in a hexadecimal literal.
    public int showBug(int value) {
        // BUG: AvoidUsingOctalValues
        return 0x100 + value; // The '0x' notation indicates a hexadecimal literal.
    }
}

/*
{
    "Bug_Explanation": "The bug is embedded in the'showBug' method, where the hexadecimal literal '0x100' is preceded by a zero. This causes the rest of the literal to be interpreted as an octal value, resulting in the wrong output.",
    "Buggy_Line": [3, 4]
}
*/

// Mutation Operator name: Unreachable while loop
// Mutation Operator description: Inserting unreachable while loop into a randomly selected basic block in the program. The condition of the inserted loop is always false to make it unreachable.
class OctalValueBugExample {

    // This method demonstrates the bug by using an octal value in a hexadecimal literal.
    public int showBug(int value) {
        // BUG: AvoidUsingOctalValues
        return 0x100 + value; // The '0x' notation indicates a hexadecimal literal.
    }

    // Mutated Code: Unreachable while loop
    public int showBug(int value) {
        while (false) {
            return 0x100 + value;
        }
        return 0x100 + value; // The '0x' notation indicates a hexadecimal literal.
    }
}