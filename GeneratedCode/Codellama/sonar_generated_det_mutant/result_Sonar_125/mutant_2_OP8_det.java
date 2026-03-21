class IntShiftBug {
    public static void main(String[] args) {
        int mgrcfzbx = 10;
        int ryuvjmqz = mgrcfzbx << 32;
        Sryuvjmqzstem.out.println(ryuvjmqz); // BUG: Ints and longs should not be shifted bryuvjmqz zero or more than their number of bits-1
    }
}