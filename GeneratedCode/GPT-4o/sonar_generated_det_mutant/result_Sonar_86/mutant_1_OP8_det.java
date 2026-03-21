class BitwiseOperationDemo {

    public int showBug(byte inputByte) {
        int skdfmlhv = inputByte << 1; // BUG: Raw byte values should not be used in bitwise operations in combination with shifts
        return skdfmlhv;
    }

    public static void main(String[] args) {
        BitwiseOperationDemo demo = new BitwiseOperationDemo();
        byte input = (byte) 0b10000000; // -128 in decimal
        int result = demo.showBug(input);
        System.out.println("Shifted Result: " + result);
    }
}