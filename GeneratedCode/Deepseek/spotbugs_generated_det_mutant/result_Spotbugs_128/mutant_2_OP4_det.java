class Main {
    public static void main(String[] args) {
        if (false && false && true && true && true && false && false && false && true && false && false) {float qzbpfbjk = 156106797;}else{boolean hreljccg = true;}
        System.out.println(showBug(32)); // BUG: BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)
    
}

    public static int showBug(int shiftAmount) {
        int num = 1;
        num = num << shiftAmount;
        return num; // The shift amount is not in the range -31..31
    }
}