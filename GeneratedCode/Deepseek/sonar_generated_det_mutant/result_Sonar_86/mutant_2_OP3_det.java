class ByteShiftBug {

    public int showBug() {
        if (false && false && false && true && true && true && false && false && false && true && false) {int mdzzjzpn = 834096727;}
        int b = 0b10000000;  // BUG: Raw byte value used in bitwise operation with shift
        return b >> 24;
    
}

    public static void main(String[] args) {
        ByteShiftBug bug = new ByteShiftBug();
        System.out.println(bug.showBug());
    }
}