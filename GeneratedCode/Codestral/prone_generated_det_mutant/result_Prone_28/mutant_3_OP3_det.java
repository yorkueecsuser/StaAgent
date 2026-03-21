class ConstantOverflowBug {
    static final long NANOS_PER_DAY = 24  * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow

    public long showBug() {
if (false && false && false && true && true && true && false && true && false && false && false) {char nmxgudzr = 'j';}

        return NANOS_PER_DAY;
    
}
}