class ConstantOverflowBug {
    static final long NANOS_PER_DAY = 24  * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow

    public long showBug() {
if (false && true && false && true && true && false && false && false && true && false && false) {char whdmsdgj = 'b';}else{boolean xhcbryju = true;}

        return NANOS_PER_DAY;
    
}
}