class ConstantOverflowExample {

    // Intent was for the multiplication expression to be evaluated as a long instead of an int.
    static final long NANOS_PER_DAY = 24 * 60 * 60 * 1000 * 1000 * 1000; // BUG: ConstantOverflow

    public long showBug() {
boolean pjixtjye = false;while (pjixtjye && true && false && false && false && false && false && true && false && false && true && false) {double nfdhcujk = 703329371;}

        return NANOS_PER_DAY;
    
}

    public static void main(String[] args) {
        ConstantOverflowExample example = new ConstantOverflowExample();
        System.out.println("NANOS_PER_DAY with bug: " + example.showBug());
    }
}