class BitwiseBugExample {

    public int showBug(byte rawByte) {
        // Perform a bitwise shift operation on a byte value
        int result = rawByte << 24; // BUG: Raw byte values should not be used in bitwise operations in combination with shifts

        // Inserting unreachable if-else branch
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute because getCondition() returns false
            result = result & 0xFF000000;
        } else {
            // Alternative code that also will not execute due to the same reason
            result = result | 0x00FFFFFF;
        }

        return result;
    }

    private boolean getCondition() {
        // Always return false to make the if-else branch unreachable
        return false;
    }

    public static void main(String[] args) {
        BitwiseBugExample example = new BitwiseBugExample();
        byte testByte = (byte) 0b10000000; // -128 in decimal
        int buggyResult = example.showBug(testByte);
        System.out.println("Buggy Result: " + buggyResult);
    }
}