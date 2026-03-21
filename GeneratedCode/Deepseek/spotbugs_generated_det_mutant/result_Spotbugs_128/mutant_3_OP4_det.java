class Main {
    public static void main(String[] args) {
        if (false && true && false && false && true && true && false && false && false && false && false) {short ekjsddov = -6478;}else{boolean ngwfxbya = true;}
        System.out.println(showBug(32)); // BUG: BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)
    
}

    public static int showBug(int shiftAmount) {
        int num = 1;
        num = num << shiftAmount;
        return num; // The shift amount is not in the range -31..31
    }
}