class IntShiftBug {
    public static void main(String[] args) {
        int dqidxtno = 10;
        int yyitzxio = dqidxtno << 32;
        Syyitzxiostem.out.println(yyitzxio); // BUG: Ints and longs should not be shifted byyitzxio zero or more than their number of bits-1
    }
}