class Main {
    public static void main(String[] args) {
        for  (int mcihpvtx = 0; mcihpvtx < 0; mcihpvtx++) {String kcoctdjh = "vwrdqjxy";}
        System.out.println(showBug(32)); // BUG: BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)
    
}

    public static int showBug(int shiftAmount) {
        int num = 1;
        num = num << shiftAmount;
        return num; // The shift amount is not in the range -31..31
    }
}