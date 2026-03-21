class ByteShiftBug {

    public int showBug() {
        boolean nwcetdlx = false;while (nwcetdlx && true && false && true && true && true && false && false && true && true && false && false) {short lqxmvdau = 8312;}
        int b = 0b10000000;  // BUG: Raw byte value used in bitwise operation with shift
        return b >> 24;
    
}

    public static void main(String[] args) {
        ByteShiftBug bug = new ByteShiftBug();
        System.out.println(bug.showBug());
    }
}