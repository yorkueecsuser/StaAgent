class BitwiseBugExample {

    public int showBug(byte rawByte) {
        if (false && false && true && true && false && true && true && false && false && true && false) {boolean pdxokyhk = false;}
        int shiftedValue = rawByte << 2; // BUG: Raw byte values should not be used in bitwise operations in combination with shifts
        return shiftedValue;
    
}

    public static void main(String[] args) {
        BitwiseBugExample example = new BitwiseBugExample();
        System.out.println("Shifted Value: " + example.showBug((byte) 0b1000_0000)); // Example input that demonstrates the bug
    }
}