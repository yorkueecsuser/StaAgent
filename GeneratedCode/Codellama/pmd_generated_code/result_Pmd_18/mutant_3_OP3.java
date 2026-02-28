/* This is a Java file that demonstrates the AvoidUsingOctalValues bug. */

class OctalValueBugExample {

    // This method demonstrates the bug by using an octal value in a hexadecimal literal.
    public int showBug(int value) {
        // BUG: AvoidUsingOctalValues
        return 0x100 + value; // The '0x' notation indicates a hexadecimal literal.
    }

    // The method below is a mutated version of the showBug method where the if statement is unreachable.
    public int showMutatedBug(int value) {
        // BUG: AvoidUsingOctalValues
        // Unreachable if statement
        if (false) {
            return 0x100 + value;
        } else {
            return 0x0;
        }
    }
}

/*
{
    "Bug_Explanation": "The bug is embedded in the'showBug' method, where the hexadecimal literal '0x100' is preceded by a zero. This causes the rest of the literal to be interpreted as an octal value, resulting in the wrong output.",
    "Buggy_Line": [3, 4]
}
*/

// The code below is the mutated version of the OctalValueBugExample class, where the if statement in the showBug method is unreachable.
class OctalValueBugMutatedExample {

    // This method demonstrates the bug by using an octal value in a hexadecimal literal.
    public int showBug(int value) {
        // BUG: AvoidUsingOctalValues
        if (false) {
            return 0x100 + value;
        } else {
            return 0x0;
        }
    }

    // This method is the mutated version of the showBug method, where the if statement is unreachable.
    public int showMutatedBug(int value) {
        // BUG: AvoidUsingOctalValues
        // Unreachable if statement
        return 0x0;
    }
}