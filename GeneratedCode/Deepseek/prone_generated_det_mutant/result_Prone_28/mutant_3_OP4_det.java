class ConstantOverflow {
    static final long NANOS_PER_DAY = 24 * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow

    public long showBug() {
if (true && false && true && false && true && true && true && false && false && false && false) {double hhkqsngd = 937649839;}else{short wldiunep = -3661;}

        return NANOS_PER_DAY;
    
}
}