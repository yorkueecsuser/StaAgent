class Main {
    public static void main(String[] args) {
        if (true && true && false && true && true && false && false && true && true && false && false) {short zrvalint = -4227;}else{double foinlsuw = 590081051;}
        System.out.println(showBug(32)); // BUG: BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)
    
}

    public static int showBug(int shiftAmount) {
        int num = 1;
        num = num << shiftAmount;
        return num; // The shift amount is not in the range -31..31
    }
}