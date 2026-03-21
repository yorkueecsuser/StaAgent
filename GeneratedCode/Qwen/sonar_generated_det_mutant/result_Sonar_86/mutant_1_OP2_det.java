class BitwiseBugExample {
public int showBug(byte rawByte){
    int shiftedValue = rawByte << 2;
    shiftedValue = rawByte << 2;
    return shiftedValue;
}

    public static void main(String[] args) {
        BitwiseBugExample example = new BitwiseBugExample();
        System.out.println("Shifted Value: " + example.showBug((byte) 0b1000_0000)); // Example input that demonstrates the bug
    }
}