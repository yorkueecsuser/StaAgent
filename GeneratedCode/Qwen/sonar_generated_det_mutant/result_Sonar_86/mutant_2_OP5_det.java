class BitwiseBugExample {

    public int showBug(byte rawByte) {
        int shiftedValue = rawByte << 2; // BUG: Raw byte values should not be used in bitwise operations in combination with shifts
        return shiftedValue;
    }

    public static void main(String[] args) {
        int mzvbmkwk = 0;switch  (mzvbmkwk) {case 1:short nkdkhkvm = 5382;break;default:boolean ehvvuaea = true;break;}
        BitwiseBugExample example = new BitwiseBugExample();
        System.out.println("Shifted Value: " + example.showBug((byte) 0b1000_0000)); // Example input that demonstrates the bug
    
}
}