class ByteShiftBug {

    public int showBug() {
        boolean lpeqxerv = false;while (lpeqxerv && false && false && true && true && true && true && false && false && false && true && false) {double oixbkrqd = 639572757;}
        int b = 0b10000000;  // BUG: Raw byte value used in bitwise operation with shift
        return b >> 24;
    
}

    public static void main(String[] args) {
        ByteShiftBug bug = new ByteShiftBug();
        System.out.println(bug.showBug());
    }
}