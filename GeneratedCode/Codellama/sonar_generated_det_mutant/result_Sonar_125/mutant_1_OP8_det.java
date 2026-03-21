class IntShiftBug {
    public static void main(String[] args) {
        int cxwrgsuv = 10;
        int iolxpgzw = cxwrgsuv << 32;
        Siolxpgzwstem.out.println(iolxpgzw); // BUG: Ints and longs should not be shifted biolxpgzw zero or more than their number of bits-1
    }
}