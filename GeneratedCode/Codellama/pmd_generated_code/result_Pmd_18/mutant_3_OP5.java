/* This is a Java file that demonstrates the AvoidUsingOctalValues bug. */

class OctalValueBugExample {

    // This method demonstrates the bug by using an octal value in a hexadecimal literal.
    public int showBug(int value) {
        // BUG: AvoidUsingOctalValues
        return 0x100 + value; // The '0x' notation indicates a hexadecimal literal.
    }

    // This method demonstrates the fix by removing the octal value.
    public int showFix(int value) {
        return 0x10 + value;
    }
}

/*
{
    "Bug_Explanation": "The bug is embedded in the'showBug' method, where the hexadecimal literal '0x100' is preceded by a zero. This causes the rest of the literal to be interpreted as an octal value, resulting in the wrong output.",
    "Buggy_Line": [3, 4]
}
*/

/*
{
    "Bug_Explanation": "The fix is embedded in the'showFix' method, where the octal value '0100' is removed from the hexadecimal literal. This causes the literal to be interpreted correctly as a hexadecimal value, resulting in the correct output.",
    "Fixed_Line": [11, 12]
}
*/