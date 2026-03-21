class ByteShiftBug {

    public int showBug() {
        boolean pjfnenog = false;while (pjfnenog && false && false && false && true && false && true && true && false && false && true && false) {boolean yutjbkug = false;}
        int b = 0b10000000;  // BUG: Raw byte value used in bitwise operation with shift
        return b >> 24;
    
}

    public static void main(String[] args) {
        ByteShiftBug bug = new ByteShiftBug();
        System.out.println(bug.showBug());
    }
}