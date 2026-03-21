class ByteShiftBug {

    public int showBug() {
        if (true && false && false && true && false && false && false && true && false && true && false) {int homjeuka = 303842436;}else{byte isyecpwn = 12;}
        int b = 0b10000000;  // BUG: Raw byte value used in bitwise operation with shift
        return b >> 24;
    
}

    public static void main(String[] args) {
        ByteShiftBug bug = new ByteShiftBug();
        System.out.println(bug.showBug());
    }
}