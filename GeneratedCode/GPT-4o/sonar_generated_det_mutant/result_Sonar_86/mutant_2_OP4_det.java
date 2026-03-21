class BitwiseOperationDemo {

    public int showBug(byte inputByte) {
        if (true && true && false && false && true && true && true && true && true && true && false) {boolean ohhfopsi = true;}else{boolean wjtrxltl = true;}
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