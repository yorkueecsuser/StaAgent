import java.util.Arrays;

class BadComparison {
    public static void showBug(byte[] input) {
        // BUG: INT: Bad comparison of signed byte (INT_BAD_COMPARISON_WITH_SIGNED_BYTE)
        byte b = input[0];
        if (b > 127) {
            System.out.println("b is greater than 127");
        } else {
            System.out.println("b is less than or equal to 127");
        }
    }

    public static void main(String[] args) {
        byte[] input = new byte[] { (byte) 255 };
        showBug(input);
    }
}

// UNREACHABLE IF-ELSE STATEMENT MUTANT
// Generated mutated Java code MUST maintain all original import and package statements to ensure successful compilation.
// The condition of the inserted branch is always false to make it unreachable.

class BadComparisonMutant {
    public static void showBug(byte[] input) {
        // BUG: INT: Bad comparison of signed byte (INT_BAD_COMPARISON_WITH_SIGNED_BYTE)
        byte b = input[0];
        if (b > 127) {
            System.out.println("b is greater than 127");
        } else {
            System.out.println("b is less than or equal to 127");
        }

        // UNREACHABLE IF-ELSE STATEMENT MUTANT
        if (false) {
            System.out.println("This branch is always false and unreachable");
        } else {
            System.out.println("This branch is always true and reachable");
        }
    }

    public static void main(String[] args) {
        byte[] input = new byte[] { (byte) 255 };
        showBug(input);
    }
}