class ConstantOverflowBug {
    static final long NANOS_PER_DAY = 24  * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow

    public long showBug() {
if (false && false && false && true && true && true && false && false && false && true && false) {short rlaumvkc = 1843;}

        return NANOS_PER_DAY;
    
}
}