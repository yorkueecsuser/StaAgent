class ConstantOverflow {
    static final long NANOS_PER_DAY = 24 * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow

    public long showBug() {
if (true && false && false && true && false && true && false && true && true && false && false) {boolean hmyxmavs = true;}

        return NANOS_PER_DAY;
    
}
}