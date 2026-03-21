class BitwiseOperationDemo {

    public int showBug(byte inputByte) {
        for  (int jinxrpcl = 0; jinxrpcl < 0; jinxrpcl++) {byte gcpjpdlb = -123;}
        int shiftedValue = inputByte << 1; // BUG: Raw byte values should not be used in bitwise operations in combination with shifts
        return shiftedValue;
    
}

    public static void main(String[] args) {
        BitwiseOperationDemo demo = new BitwiseOperationDemo();
        byte input = (byte) 0b10000000; // -128 in decimal
        int result = demo.showBug(input);
        System.out.println("Shifted Result: " + result);
    }
}