class BitwiseOperationExample {

    public int showBug(byte inputByte) {
        // The following line demonstrates the bug
        int shiftedValue = inputByte << 1; // BUG: Raw byte values should not be used in bitwise operations in combination with shifts
        return shiftedValue;
    }

    public static void main(String[] args) {
        BitwiseOperationExample example = new BitwiseOperationExample();
        byte testValue = (byte) 0b1000_0000; // Example byte with a negative value (-128)
        int result = example.showBug(testValue);
        System.out.println("Result of shifting: " + result);
    }
}