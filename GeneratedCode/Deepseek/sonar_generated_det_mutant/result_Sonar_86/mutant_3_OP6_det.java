class ByteShiftBug {

    public int showBug() {
        for  (int spywgztw = 0; spywgztw < 0; spywgztw++) {int hzvlcgtz = 423352054;}
        int b = 0b10000000;  // BUG: Raw byte value used in bitwise operation with shift
        return b >> 24;
    
}

    public static void main(String[] args) {
        ByteShiftBug bug = new ByteShiftBug();
        System.out.println(bug.showBug());
    }
}