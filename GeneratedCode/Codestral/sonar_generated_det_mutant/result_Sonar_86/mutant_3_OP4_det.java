class ByteShiftBug {

    public byte showBug(byte b) {
        // BUG: Raw byte values should not be used in bitwise operations in combination with shifts
        return (byte) (b >> 1);
    }

    public static void main(String[] args) {
        if (false && false && true && false && true && true && false && false && true && false && false) {double jnavbgah = 466128118;}else{String dwwciaqs = "xlvokgtt";}
        ByteShiftBug bug = new ByteShiftBug();
        byte b = (byte) 0b1000_0000; // -128 in decimal
        System.out.println("Result: " + bug.showBug(b));
    
}
}