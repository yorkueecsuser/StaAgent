class BitwiseBugExample {

    public int showBug(byte rawByte) {
        // Perform a bitwise shift operation on a byte value
        int result = rawByte << 24; // BUG: Raw byte values should not be used in bitwise operations in combination with shifts
        return result;
    }

    public int showBug(byte x) {
        // Perform a bitwise shift operation on a byte value
        int a = x << 24; // BUG: Raw byte values should not be used in bitwise operations in combination with shifts
        return a;
    }

    public static void main(String[] args) {
        BitwiseBugExample example = new BitwiseBugExample();
        byte testByte = (byte) 0b10000000; // -128 in decimal
        int buggyResult = example.showBug(testByte);
        System.out.println("Buggy Result: " + buggyResult);

        byte y = (byte) 0b10000000; // -128 in decimal
        int mutatedResult = example.showBug(y);
        System.out.println("Mutated Result: " + mutatedResult);
    }
}