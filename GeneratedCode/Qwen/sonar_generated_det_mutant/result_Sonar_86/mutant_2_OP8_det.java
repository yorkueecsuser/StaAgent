class BitwiseBugExample {

    public int showBug(byte rawByte) {
        int kppcvbfy = rawByte << 2; // BUG: Raw byte values should not be used in bitwise operations in combination with shifts
        return kppcvbfy;
    }

    public static void main(String[] args) {
        BitwiseBugExample example = new BitwiseBugExample();
        System.out.println("Shifted Value: " + example.showBug((byte) 0b1000_0000)); // Example input that demonstrates the bug
    }
}