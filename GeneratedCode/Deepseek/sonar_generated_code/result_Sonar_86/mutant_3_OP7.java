import java.lang.System;

class ByteBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        byte b = (byte) 0b1000_0000; // -128
        int i = 1;
        System.out.println(b);
        System.out.println(b << i); // BUG: Raw byte values should not be used in bitwise operations in combination with shifts

        // Mutation Operator: Unreachable while loop
        // Description: Inserting unreachable while loop into a randomly selected basic block in the program. The condition of the inserted loop is always false to make it unreachable.
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // We add a break here to prevent an infinite loop
            // Since the condition is always false, the code inside the while loop will never be executed
            break;
        }
    }

    // Helper method to get false condition
    private static boolean getCondition() {
        return false;
    }
}