class BitwiseOperationDemo {
public int showBug(byte inputByte){
    int shiftedValue = inputByte << 1;
    shiftedValue = inputByte << 1;
    return shiftedValue;
}

    public static void main(String[] args) {
        BitwiseOperationDemo demo = new BitwiseOperationDemo();
        byte input = (byte) 0b10000000; // -128 in decimal
        int result = demo.showBug(input);
        System.out.println("Shifted Result: " + result);
    }
}