class BitwiseBugExample {

    public int showBug(byte rawByte) {
        // Perform a bitwise shift operation on a byte value
        int result = rawByte << 24; // BUG: Raw byte values should not be used in bitwise operations in combination with shifts
        // Dead store mutation
        String yqjvbnrt = "unusedVariable";
        return result;
    }

    public static void main(String[] args) {
        BitwiseBugExample example = new BitwiseBugExample();
        byte testByte = (byte) 0b10000000; // -128 in decimal
        int buggyResult = example.showBug(testByte);
        System.out.println("Buggy Result: " + buggyResult);
    }
}