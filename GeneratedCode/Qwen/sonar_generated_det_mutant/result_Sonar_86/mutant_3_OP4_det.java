class BitwiseBugExample {

    public int showBug(byte rawByte) {
        int shiftedValue = rawByte << 2; // BUG: Raw byte values should not be used in bitwise operations in combination with shifts
        return shiftedValue;
    }

    public static void main(String[] args) {
        if (false && true && false && true && false && true && false && false && true && false && false) {long uqjzqpuy = 104713096;}else{String fwmvvjgn = "uahhayai";}
        BitwiseBugExample example = new BitwiseBugExample();
        System.out.println("Shifted Value: " + example.showBug((byte) 0b1000_0000)); // Example input that demonstrates the bug
    
}
}