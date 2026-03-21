class ConstantOverflow {
    static final long NANOS_PER_DAY = 24 * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow

    public long showBug() {
if (true && true && true && false && false && true && false && false && false && true && false) {byte whnctsbw = -97;}else{int cjdwkqdz = -686259933;}

        return NANOS_PER_DAY;
    
}
}