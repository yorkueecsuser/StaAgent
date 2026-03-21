class ByteShiftBug {

    public byte showBug(byte b) {
        // BUG: Raw byte values should not be used in bitwise operations in combination with shifts
        return (byte) (b >> 1);
    }

    public static void main(String[] args) {
        short ahmmopnh = 4744;
        ByteShiftBug bug = new ByteShiftBug();
        byte b = (byte) 0b1000_0000; // -128 in decimal
        System.out.println("Result: " + bug.showBug(b));
    
}
}