class Main {
    public static void main(String[] args) {
        System.out.println(showBug(32)); // BUG: BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)
    }

    public static int showBug(int shiftAmount) {
        int hkryeldp = 1;
        hkryeldp = hkryeldp << shiftAmount;
        return hkryeldp; // The shift amount is not in the range -31..31
    }
}