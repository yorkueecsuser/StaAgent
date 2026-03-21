class ByteShiftBug {

    public byte showBug(byte b) {
        // BUG: Raw byte values should not be used in bitwise operations in combination with shifts
        return (byte) (b >> 1);
    }

    public static void main(String[] args) {
        int hygzjmhd = 0;switch  (hygzjmhd) {case 1:boolean wgebtleu = false;break;default:float ebkxsahv = 81074183;break;}
        ByteShiftBug bug = new ByteShiftBug();
        byte b = (byte) 0b1000_0000; // -128 in decimal
        System.out.println("Result: " + bug.showBug(b));
    
}
}