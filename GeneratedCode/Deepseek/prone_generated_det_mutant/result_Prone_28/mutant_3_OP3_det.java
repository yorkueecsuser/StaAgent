class ConstantOverflow {
    static final long NANOS_PER_DAY = 24 * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow

    public long showBug() {
if (false && true && true && false && false && false && true && true && true && true && false) {float vnmrijzc = 468558585;}

        return NANOS_PER_DAY;
    
}
}