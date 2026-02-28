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
        boolean condition = getCondition(); // This method should return false
        while (condition) { // This loop will never run because the condition is always false
            // Do nothing
        }
    }

    // This method returns false to satisfy the mutation condition
    public static boolean getCondition() {
        return false;
    }
}