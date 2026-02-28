class BitwiseBugExample {

    public int showBug(byte rawByte) {
        // Perform a bitwise shift operation on a byte value
        int result = rawByte << 24; // BUG: Raw byte values should not be used in bitwise operations in combination with shifts

        // Inserting an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // This block will never execute because getCondition() always returns false
            result = result + 1;
        } else {
            // This block will always execute
            result = result - 1;
        }

        return result;
    }

    private boolean getCondition() {
        // Always returns false to ensure the if block is unreachable
        return false;
    }

    public static void main(String[] args) {
        BitwiseBugExample example = new BitwiseBugExample();
        byte testByte = (byte) 0b10000000; // -128 in decimal
        int buggyResult = example.showBug(testByte);
        System.out.println("Buggy Result: " + buggyResult);
    }
}