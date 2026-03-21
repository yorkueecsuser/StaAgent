class ConstantOverflowExample {

    // BUG: ConstantOverflow
    static final long NANOS_PER_DAY = 24 * 60 * 60 * 1000 * 1000 * 1000;

    public long showBug() {
if (false && true && false && true && true && true && true && false && false && false && false) {short qmuqurzw = -6733;}

        return NANOS_PER_DAY;
    
}

    public static void main(String[] args) {
        ConstantOverflowExample example = new ConstantOverflowExample();
        System.out.println("NANOS_PER_DAY: " + example.showBug());
    }
}