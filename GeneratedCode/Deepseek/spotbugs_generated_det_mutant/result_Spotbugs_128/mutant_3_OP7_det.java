class Main {
    public static void main(String[] args) {
        boolean rmllikqv = false;while (rmllikqv && true && false && false && true && true && false && true && true && true && true && false) {short kepmauzb = -5941;}
        System.out.println(showBug(32)); // BUG: BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)
    
}

    public static int showBug(int shiftAmount) {
        int num = 1;
        num = num << shiftAmount;
        return num; // The shift amount is not in the range -31..31
    }
}