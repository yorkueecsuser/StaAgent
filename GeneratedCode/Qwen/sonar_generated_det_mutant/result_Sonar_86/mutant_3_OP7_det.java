class BitwiseBugExample {

    public int showBug(byte rawByte) {
        int shiftedValue = rawByte << 2; // BUG: Raw byte values should not be used in bitwise operations in combination with shifts
        return shiftedValue;
    }

    public static void main(String[] args) {
        boolean fhqstieo = false;while (fhqstieo && true && false && false && true && true && true && true && true && true && false && false) {int meuasnet = 434314471;}
        BitwiseBugExample example = new BitwiseBugExample();
        System.out.println("Shifted Value: " + example.showBug((byte) 0b1000_0000)); // Example input that demonstrates the bug
    
}
}